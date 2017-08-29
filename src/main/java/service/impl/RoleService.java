package service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.system.IRoleDao;
import dmo.Role;
import service.IRoleService;

@Service
public class RoleService implements IRoleService {
	
	@Resource
	private IRoleDao roleDao;
	
	@Resource
	private ResourceService resourceService;

	@Override
	public void createRole(Role role) {
		roleDao.createRole(role);

	}

	@Override
	public void updateRole(Role role) {
		roleDao.updateRole(role);

	}

	@Override
	public void deleteRole(Long roleId) {
		roleDao.deleteRole(roleId);
	}

	@Override
	public Role findOne(Long roleId) {
		return roleDao.selectOne(roleId);
	}

	@Override
	public List<Role> findAll() {
		return roleDao.findAll();
	}

	@Override
	public Set<String> findRoles(Long... roleIds) {
		Set<String> roles = new HashSet<String>();
		for(Long roleId:roleIds) {
			Role role = roleDao.selectOne(roleId);
			if(role != null) {
				roles.add(role.getRole());
			}
		}
		return roles;
	}

	@Override
	public Set<String> findPermissions(Long[] roleIds) {
		Set<Long> resourceIds =  new HashSet<Long>();
		for(Long roleId:roleIds) {
			Role role = roleDao.selectOne(roleId);
			if( role!=null) {
				resourceIds.addAll(role.getResourceIds());
			}
		}
		return resourceService.findPermissions(resourceIds);
	}

}
