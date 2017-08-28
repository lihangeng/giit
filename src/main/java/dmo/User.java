package dmo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

public class User {
	/*
	 * 用户名
	 */
	private String username;
	
    private String userId;

    private String password;
    /*
     * 密码佐料
     */
    private String salt;
    /*
     * 拥有的角色列表
     */
    private List<Long> roleIds;

    private Boolean locked = Boolean.FALSE;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
    
    public String getCredentialsSalt() {
        return username + salt;
    }
    /**
     * 获取角色列表
     * @return
     */
    public String getRoleIdsStr() {
    	
    	if(CollectionUtils.isEmpty(roleIds)) {
    		return "";
    	}
    	StringBuffer str = new StringBuffer();
    	for(int i=0;i<roleIds.size();i++) {
			Long roleId = roleIds.get(i);
			str.append(roleId);
			str.append(",");
		}
    	return str.toString();
    }
    /**
     * 设置角色列表
     * @param rolesIdStr
     */
    public void setRoleIdsStr(String rolesIdStr) {
    	if(rolesIdStr.isEmpty()) {
    		return ;
    	}
    	List<Long> rolesIds = new ArrayList<Long>();
    	String[] rolesIdStrs = rolesIdStr.split(",");
    	for(String rolesId:rolesIdStrs) {
    		if(rolesId.isEmpty()) {
    			continue;
    		}
    		rolesIds.add(Long.valueOf(rolesId));
    	}
    }
}