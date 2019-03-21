package com.xian.menu.pojo;

import java.util.List;

public class Menu {
    private Integer menuId;
    private String menuName;
    private String jumpUrl;
    private Integer parentId;
    private String iconUrl;
    List<Menu> children;

    public Menu() {
    }

    public Menu(Integer menuId, String menuName, String jumpUrl, Integer parentId, String iconUrl, List<Menu> children) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.jumpUrl = jumpUrl;
        this.parentId = parentId;
        this.iconUrl = iconUrl;
        this.children = children;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", jumpUrl='" + jumpUrl + '\'' +
                ", parentId=" + parentId +
                ", iconUrl='" + iconUrl + '\'' +
                ", children=" + children +
                '}';
    }
}
