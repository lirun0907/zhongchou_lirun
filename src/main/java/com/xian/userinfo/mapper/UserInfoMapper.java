package com.xian.userinfo.mapper;

import com.xian.userinfo.pojo.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    /*查询所有用户*/
    public List<UserInfo> selectAllUserInfo();
    /*添加用户*/
    public Integer addUserInfo(UserInfo userInfo);
    /*修改用户*/
    public Integer updateUserInfoBy(UserInfo userInfo);
    /*删除用户*/
    public Integer deleteUserInfoById(Integer id);
    /*动态查询，查询一个集合*/
    public List<UserInfo> selectUserInfoBy(UserInfo userInfo);
    /*动态查询,查询一个结果*/
    public UserInfo selectUserInfoBy1(UserInfo userInfo);
}
