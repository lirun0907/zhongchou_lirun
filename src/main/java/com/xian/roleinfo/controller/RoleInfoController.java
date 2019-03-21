package com.xian.roleinfo.controller;

import com.xian.roleinfo.pojo.RoleInfo;
import com.xian.roleinfo.service.RoleService;
import com.xian.roleinfo.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleInfoController {
    @Autowired
    RoleService roleService;
    /*获得所有角色信息*/
    @RequestMapping("getAllRole")
    public Object getAllRole(){
        return roleService.selectAllRoleInfo();
    }
    /*根据id删除用户*/
    @RequestMapping(value = "deleteRole",method = RequestMethod.POST)
    public Object deleteRole(@RequestParam int roleId){
        return roleService.deleteRoleInfo_RoleMenuByRoleId(roleId);
    }
    /*根据id查询角色*/
    @RequestMapping("selectRoleById")
    public Object selectRoleById(@RequestBody RoleInfo roleInfo){
        return roleService.selectRoleInfoBy1(roleInfo);
    }

    /*修改角色*/
    @RequestMapping("updateRole")
    public Object updateRole(@RequestBody RoleInfo roleInfo){
        return roleService.updateRoleInfoBy(roleInfo);
    }
    /*新增角色*/
    @RequestMapping("addRole")
    public Object addRole(@RequestBody RoleInfo roleInfo){
        System.out.println(roleInfo);
        return roleService.addRoleInfo(roleInfo);
    }
    /*模糊查询*/
    @RequestMapping("selectRoleLike")
    public Object selectRoleLike(@RequestBody RoleInfo roleInfo){
        List<RoleInfo> roleInfoList = roleService.selectRoleInfoBy(roleInfo);
        return  roleInfoList;
    }
    /*两表联查被选中的角色*/
    @RequestMapping("selectUserinfoSelected")
    public Object selectUserinfoSelected(@RequestParam Integer userId){
        List<RoleInfo> roleInfoList = roleService.selectUserinfoSelected(userId);
        return  roleInfoList;
    }
    /*两表联查没有被选中的角色*/
    @RequestMapping("selectUserinfoNotSelected")
    public Object selectUserinfoNotSelected(@RequestParam Integer userId){
        List<RoleInfo> roleInfoList = roleService.selectUserinfoNotSelected(userId);
        return  roleInfoList;
    }
    /*根据userId删除userinfo_roleinfo中间表中的信息*/
    /*给中间表userinfo_roleinfo添加数据*/
    @RequestMapping("deleteAndAddUserinfo_Roleinfo")
    public Object deleteAndAddUserinfo_Roleinfo(@RequestBody UserRoleVo userRoleVo){
        return roleService.deleteAndAddUserinfo_Roleinfo(userRoleVo);
    }
}