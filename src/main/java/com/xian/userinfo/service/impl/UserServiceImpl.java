package com.xian.userinfo.service.impl;

import com.xian.userinfo.mapper.UserInfoMapper;
import com.xian.userinfo.pojo.UserInfo;
import com.xian.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserInfoMapper userInfoMapper;
    /*查询所有用户*/
    public List<UserInfo> selectAllUserInfo() {
        List<UserInfo> userInfoList=userInfoMapper.selectAllUserInfo();
        return userInfoList;
    }
    /*添加用户*/
    public Integer insertUserinfo(UserInfo userInfo) {
        return userInfoMapper.addUserInfo(userInfo);
    }
    /*修改用户户*/
    public Integer updateUserinfo(UserInfo userInfo) {
        return userInfoMapper.updateUserInfoBy(userInfo);
    }
    /*删除用户*/

    public Integer deleteUserinfo(Integer id) {
        return userInfoMapper.deleteUserInfoById(id);
//        throw new RuntimeException("删除用户异常");
    }

    /*动态查询*/
    public List<UserInfo> selectUserInfoBy(UserInfo userInfo) {
        List<UserInfo> userInfo1=userInfoMapper.selectUserInfoBy(userInfo);
        return userInfo1;
    }
    /*动态查询,查询一个结果*/
    public UserInfo selectUserInfoBy1(UserInfo userInfo) {
        return userInfoMapper.selectUserInfoBy1(userInfo);
    }

}
