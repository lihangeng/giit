package com.giit.web.dmo;

import com.giit.web.enums.ResourceType;

public class Resource {
    private Long id;
    /*
     *资源名称
     */
    private String name;
    /*
     * 资源类型
     */
    private ResourceType type;
    /*
     * 资源路径
     */
    private String url;
    /*
     * 父编号
     */
    private Long parentId;
    /*
     * 父编号列表
     */
    private String parentIds;
    /*
     * 权限字符串
     */
    private String permission;
    /*
     * 
     */
    private Boolean available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
    
    public Boolean isRootNote() {
    	return parentId == 0;
    }
}