package com.xian.menu.vo;

import java.util.List;

public class ImpowerVo {
    Integer roleId;
    List<Integer> menus;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getMenus() {
        return menus;
    }

    public void setMenus(List<Integer> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "ImpowerVo{" +
                "roleId=" + roleId +
                ", menus=" + menus +
                '}';
    }
}
