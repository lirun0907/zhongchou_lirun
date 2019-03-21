package com.xian.userinfo.service;

import com.xian.userinfo.pojo.UserInfo;

import java.util.List;

public interface UserService {
    /*查询所有用户*/
    public List<UserInfo> selectAllUserInfo();
    /*添加用户*/
    public Integer insertUserinfo(UserInfo userInfo);
    /*修改用户*/
    public Integer updateUserinfo(UserInfo userInfo);
    /*删除用户*/
    public Integer deleteUserinfo(Integer id);
    /*动态查询*/
    public List<UserInfo> selectUserInfoBy(UserInfo userInfo);
    /*动态查询,查询一个结果*/
    public UserInfo selectUserInfoBy1(UserInfo userInfo);
}
