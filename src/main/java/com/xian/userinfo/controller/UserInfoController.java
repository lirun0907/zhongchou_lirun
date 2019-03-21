package com.xian.userinfo.controller;

import com.xian.userinfo.pojo.UserInfo;
import com.xian.userinfo.service.UserService;
import com.xian.userinfo.vo.UserInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    UserService userService;
   @RequestMapping("selectAllUserInfo")
    public List<UserInfo> selectAllUserInfo() {
        return userService.selectAllUserInfo();
    }

    @RequestMapping("checkLogin")
    /*登录方法*/
    public Object checkLogin(@RequestParam String account, String password,String type, HttpSession session){
        //System.out.println("account="+account+",password="+password);
        UserInfo userInfo=new UserInfo();
        userInfo.setAccount(account);
        userInfo.setPassword(password);
        userInfo.setType(type);
//        System.out.println(userInfo);
        UserInfo userInfo1=userService.selectUserInfoBy1(userInfo);
//        System.out.println(userInfo1);
        if(userInfo1!=null){
            session.setAttribute("userInfo",userInfo1);
            return userInfo1;
        }else {
            return false;
        }

    }

    @RequestMapping("insertUserInfo")
    public Object insertUserInfo(@Valid @RequestBody UserInfoVo userInfoVo, BindingResult result){
        HashMap<String,String> map=new HashMap<String,String>();
        // 如果入参有问题，返回注册页面
        if (result.hasErrors()) {
            List<FieldError> errorList = result.getFieldErrors();
            for(FieldError error : errorList){
//                System.out.println(error.getField() + "*" + error.getDefaultMessage());
                map.put(error.getField(), error.getDefaultMessage());
            }
            return map;
        }
        UserInfo userInfo=new UserInfo();
        BeanUtils.copyProperties(userInfoVo,userInfo);
        return userService.insertUserinfo(userInfo);

    }

    @RequestMapping("selectAllUserInfoToWeb")
    public Object selectAllUserInfoToWeb() {
        return userService.selectAllUserInfo();
    }
    /*根据id查询用户*/
    @RequestMapping("selectUserInfoBy")
    public UserInfo selectUserInfoBy(@RequestBody UserInfo userInfo) {
        return userService.selectUserInfoBy1(userInfo);
    }
    /*根据id修改用户*/
    @RequestMapping("updateUser")
    public Integer updateUser(@RequestBody UserInfo userInfo) {
        return userService.updateUserinfo(userInfo);
    }

    /*根据id删除用户*/
    @RequestMapping("deleteUser")
    public Integer deleteUser(@RequestParam Integer userId) {
        return userService.deleteUserinfo(userId);
    }

    /*添加用户*/
    @RequestMapping("addUser")
    public Integer addUser(@RequestBody UserInfo userInfo) {
        return userService.insertUserinfo(userInfo);
    }
    /*模糊查询*/
    @RequestMapping("selectUserLike")
    public Object selectLike(@RequestBody UserInfo userInfo){
        List<UserInfo> userInfoList=userService.selectUserInfoBy(userInfo);
        if(userInfoList.size()>0){
            return userInfoList;
        }else {
            return false;
        }
    }

}
