package com.xian.userinfo.vo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class UserInfoVo implements Serializable{
        @Length(min = 2,max = 20,message = "名字不合法")
        private String account;
        @Length(min = 2,max = 20,message = "账号不合法")
        private String userName;
        @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$",message = "邮箱地址不合法")
        private String email;
        @Pattern(regexp = "^[0-9]{6}$",message = "密码是6位纯数字")
        String password;
        @NotBlank
        String type;
        String status = "正常";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
