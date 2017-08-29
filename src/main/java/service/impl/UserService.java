package service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.IStaffDao;
import dao.system.IRoleDao;
import dao.system.IUserDao;
import dmo.Role;
import dmo.User;
import dmo.UserVo;
import service.IUserService;
import untils.PasswordHelper;
/**
 * userService
 * @author 17051548
 *
 */
@Service("userService")
public class UserService implements IUserService {
	
	@Resource
	private IUserDao userDao;
	
	@Resource
	private IRoleDao roleDao;
	
	@Resource
	private IStaffDao staffDao;
	
	@Resource
	private PasswordHelper passwordHelper;
	
	@Resource(name="roleService")
	private RoleService roleService;

	@Override
	public List<UserVo> findAll() {

		List<UserVo> userVoList = new ArrayList<UserVo>();
		List<User> userList = userDao.findAll();
		Iterator<User> itertor = userList.iterator();
		while(itertor.hasNext()) {
			StringBuilder s = new StringBuilder();
			User user = (User)itertor.next();
			List<Long> roleIds = user.getRoleIds();
			UserVo userVo = new UserVo();
			BeanUtils.copyProperties(user, userVo);
			if(roleIds != null) {
				for(int i=0;i<roleIds.size();i++) {
					Role role = roleDao.selectOne(roleIds.get(i));
					s.append(role.getDescription());
					s.append(",");
					userVo.setRoleIdsStr(s.toString());
				}
			}
			userVoList.add(userVo);
		}
		
		return userVoList;
	}

	@Override
	public User findById(String id) {
		 return userDao.findById(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Transactional
	@Override
	public void delete(String id) {
		userDao.delete(id);
		
	}

	@Override
	public void changePassword(String userId, String newPassword) {
		User user = userDao.findById(userId);
		user.setPassword(newPassword);
		passwordHelper.encryptPassword(user);
		userDao.update(user);
	}

	@Override
	public Set<String> findRoles(String username) {
		User user = userDao.findByUsername(username);
		if(user == null) {
			return Collections.EMPTY_SET;
		}
		return roleService.findRoles(user.getRoleIds().toArray(new Long[0]));
	}

	@Override
	public Set<String> findPermissions(String username) {
		User user = userDao.findByUsername(username);
		if(user == null) {
			return Collections.EMPTY_SET;
		}
		return roleService.findPermissions(user.getRoleIds().toArray(new Long[0]));
	}

}
