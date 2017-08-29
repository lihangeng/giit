package service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authz.permission.WildcardPermission;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import dao.system.IResourceDao;
import dmo.Resource;
import enums.ResourceType;
import service.IResourceService;
/**
 * 资源控制
 * @author 17051548
 *
 */
@Service
public class ResourceService implements IResourceService {
	
	@javax.annotation.Resource
	private IResourceDao resourceDao;

	@Override
	public Resource createResource(Resource resource) {
		return resourceDao.createResource(resource);
	}

	@Override
	public Resource updateResource(Resource resource) {
		return resourceDao.updateResource(resource);
	}

	@Override
	public void deleteResource(Long resourceId) {
		resourceDao.deleteResource(resourceId);
	}

	@Override
	public Resource findOne(Long resourceId) {
		return resourceDao.findOne(resourceId);
	}

	@Override
	public List<Resource> findAll() {
		return resourceDao.findAll();
	}

	@Override
	public Set<String> findPermissions(Set<Long> resourceIds) {
		Set<String> permissions = new HashSet<String>();
		for(Long resourceId:resourceIds) {
			Resource resource = resourceDao.findOne(resourceId);
			if(resource!=null && !StringUtils.isEmpty(resource.getPermission())) {
				permissions.add(resource.getPermission());
			}
		}
		return permissions;
	}

	@Override
	public List<Resource> findMenus(Set<String> permissions) {
		List<Resource> allResource = resourceDao.findAll();
		List<Resource> menus = new ArrayList<Resource>();
		for(Resource resource:allResource) {
			if(resource.isRootNote()) {
				continue;
			}else if(resource.getType() != ResourceType.meun) {
				continue;
			}else if(!hasPermission(permissions,resource)) {
				continue;
			}
			menus.add(resource);
		}
		return menus;
	}
	
	public Boolean hasPermission(Set<String> permissions,Resource resource) {
		if(StringUtils.isEmpty(resource.getPermission())) {
			return true;
		}
		for (String permission : permissions) {
            WildcardPermission p1 = new WildcardPermission(permission);
            WildcardPermission p2 = new WildcardPermission(resource.getPermission());
            if (p1.implies(p2) || p2.implies(p1)) {
                return true;
            }
        }
        return false;
	}

}
