package com.xian.menu.mapper;

import com.xian.menu.dto.MenuDto;
import com.xian.menu.pojo.Menu;
import com.xian.menu.vo.ImpowerVo;
import com.xian.roleinfo.vo.UserRoleVo;

import java.util.List;

public interface MenuMapper {
    /*查询所有菜单根据roleId*/
    public List<MenuDto> selectAllMenu(Integer roleId);
    /*添加菜单*/
    public Integer addMenu(Menu menu);
    /*动态查询菜单(if)(模糊查询)*/
    public List<Menu> selectMenuInfoBy(Menu menu);
    /* if+where语句(查询)(具体查询一个对象)*/
    public Menu selectMenuBy1(Menu menu);
    /* 修改菜单*/
    public Integer updateMenu(Menu menu);
    /* 删除菜单*/
    public Integer deleteMenuById(Integer id);
    /*根据roleId删除中间表信息*/
    public void deleteRoleMenuByRoleId(Integer roleId);
    /*根据roleId和menus循环插入中间表数据*/
    public void batchSave(ImpowerVo impowerVo);

    /*菜单维护(单表)*/
    public List<MenuDto> selectAllMenuOnly();
    /*单表查询所有菜单*/
    public List<Menu> selectAllMenus();
    /*动态菜单显示,根据userId查询出所有的角色roleId,再根据roleId查出menu信息*/
    public List<MenuDto> selectUser_Role_Menu(UserRoleVo userRoleVo);
}
