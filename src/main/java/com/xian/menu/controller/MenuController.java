package com.xian.menu.controller;

import com.xian.menu.dto.MenuDto;
import com.xian.menu.pojo.Menu;
import com.xian.menu.service.MenuService;
import com.xian.menu.vo.ImpowerVo;
import com.xian.roleinfo.pojo.RoleInfo;
import com.xian.roleinfo.service.RoleService;
import com.xian.roleinfo.vo.UserRoleVo;
import com.xian.userinfo.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;
    @Autowired
    RoleService roleService;
    @RequestMapping("getAllMenu")
    public Object getAllMenu(@RequestParam Integer roleId){
        List<MenuDto> menuDtoList=menuService.selectAllMenu(roleId);
//        遍历集合查出每个结果集
//        for(int i = 0;i < menuDtoList.size();i++){
//            MenuDto parentMenuDto = menuDtoList.get(i);
//            int total = parentMenuDto.getChildren()!=null?parentMenuDto.getChildren().size():0;
//            int count = 0;
//            if(total>0) {
//                for (int j = 0; j < total; j++) {
//                    MenuDto childMenuDto = parentMenuDto.getChildren().get(j);
//                    if(childMenuDto.isChecked()){
//                        count++;
//                    }
//                }
//            }
//            if(count>0){
//                parentMenuDto.setChecked("true");
//            }
//        }
        return menuDtoList;
    }
    @RequestMapping(value = "impower",method = RequestMethod.POST)
    public Boolean impower(@RequestBody ImpowerVo impowerVo){
//        System.out.println(impowerVo);
//        1.根据roleId删除中间表数据
//        2.根据roleId和menus循环插入中间表数据
        menuService.batchSave(impowerVo);
        return true;
    }
    /*菜单维护(单表)*/
    @RequestMapping("selectAllMenuOnly")
    public Object selectAllMenuOnly(){
        return menuService.selectAllMenuOnly();
    }
    /*单表查询所有菜单*/
    @RequestMapping("selectAllMenus")
    public Object selectAllMenus(){
        List<Menu> menuList=menuService.selectAllMenus();
        return menuList;
    }
    /*单表添加菜单*/
    @RequestMapping("addMenu")
    public Object addMenu(@RequestBody Menu menu){
        return menuService.addMenu(menu);
    }
    /*单表删除*/
    @RequestMapping("deleteMenuById")
    public Object deleteMenuById(@RequestParam Integer menuId){
        return menuService.deleteMenuById(menuId);
    }
    /*根据id查询一个对象*/
    @RequestMapping("selectMenuById")
    public Object selectMenuById(@RequestBody Menu menu){
        System.out.println(menu);
        Menu menu1=menuService.selectMenuBy1(menu);
        System.out.println(menu1);
        return menu1;
    }

    /*根据id查询修改菜单*/
    @RequestMapping("updateMenuById")
    public Object updateMenuById(@RequestBody Menu menu){
        return menuService.updateMenu(menu);
    }
    /*动态菜单显示,根据userId查询出所有的角色roleId,再根据roleId查出menu信息*/
    @RequestMapping("selectUser_Role_Menu")
    public Object selectUser_Role_Menu(HttpSession session){
        Object object=session.getAttribute("userInfo");
        UserInfo userInfo = (UserInfo)object;
        Integer userId=userInfo.getUserId();
        /*List<RoleInfo> roleInfoList=roleService.selectUserinfoSelected(userId);
        ArrayList<Integer> roleIds = new ArrayList<Integer>();
        for (RoleInfo roleInfo:roleInfoList) {
            Integer roleId=roleInfo.getRoleId();
            roleIds.add(roleId);
        }*/
        UserRoleVo userRoleVo = new UserRoleVo(userId,null);
        List<MenuDto> menuList=menuService.selectUser_Role_Menu(userRoleVo);
//        System.out.println(menuList);
        ArrayList<MenuDto> firstMenu = new ArrayList<MenuDto>();
        for (MenuDto menuDto:menuList) {
            if(menuDto.getPid()==0){
                firstMenu.add(menuDto);
            }
        }
        for (MenuDto FirstMenu:firstMenu) {
            ArrayList<MenuDto> childList = new ArrayList<MenuDto>();
            for (MenuDto menuDto:menuList) {
                if(menuDto.getPid()==FirstMenu.getId()){
                    childList.add(menuDto);
                    FirstMenu.setChildren(childList);
                }
            }
        }
//        System.out.println(firstMenu);
        return firstMenu;
    }

}

