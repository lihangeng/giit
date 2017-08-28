package dao; 

import java.util.List;

import dmo.Role;

public interface IRoleDao {
	
	public List<Role> findAll();
		
	public void createRole(Role role);
	
	public void updateRole(Role role);
	
	public void deleteRole(Long roleId);
	
	public Role selectOne(Long roleId);
	
	public Role findByDescription(String description);

}
