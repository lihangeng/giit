package com.giit.web.enums;

public enum ResourceType {

	meun("菜单"),
	button("按钮");
	
	private final String info;
	private ResourceType(String info) {
        this.info = info;
    }
	public String getInfo() {
		return info;
	}
	
}
