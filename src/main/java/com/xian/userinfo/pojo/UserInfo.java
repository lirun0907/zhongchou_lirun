package com.xian.userinfo.pojo;

public class UserInfo {
    private Integer userId;
    private String userName;
    private String password;
    private String account;
    private String email;
    private String status;
    private String type;

    public UserInfo() {
    }

    public UserInfo(Integer userId, String userName, String password, String account, String email, String status, String type) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.account = account;
        this.email = email;
        this.status = status;
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
