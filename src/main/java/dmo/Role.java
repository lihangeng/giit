package dmo;

import java.util.List;

public class Role {
    private Long id;
    /**
     * 角色标识
     */
    private String role;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 拥有的资源
     */
    private List<Long> resourceIds;
    /**
     * 
     */
    private String resourceIdStrs;
    /**
     * 是否可用
     */
    private Boolean available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public List<Long> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<Long> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}