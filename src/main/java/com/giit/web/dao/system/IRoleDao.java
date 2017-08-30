package com.giit.web.dao.system; 

import java.util.List;

import com.giit.web.dmo.Role;
/**
 * 
 * @author 17051548
 *
 */
public interface IRoleDao {
	
	public List<Role> findAll();
		
	public void createRole(Role role);
	
	public void updateRole(Role role);
	
	public void deleteRole(Long roleId);
	
	public Role selectOne(Long roleId);
	
	public Role findByDescription(String description);

}
