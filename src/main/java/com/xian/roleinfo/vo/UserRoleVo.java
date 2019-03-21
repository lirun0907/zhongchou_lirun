package com.xian.roleinfo.vo;

import java.util.List;

public class UserRoleVo {
    private Integer userId;
    private List<Integer> roleIds;

    public UserRoleVo() {
    }

    public UserRoleVo(Integer userId, List<Integer> roleIds) {
        this.userId = userId;
        this.roleIds = roleIds;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }


}
