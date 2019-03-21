package com.xian.roleinfo.pojo;

public class RoleInfo {
    private Integer roleId;
    private String roleName;
    private String status;

    public RoleInfo() {
    }

    public RoleInfo(Integer roleId, String roleName, String status) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
