package com.xian.menu.service.impl;

import com.xian.menu.dto.MenuDto;
import com.xian.menu.mapper.MenuMapper;
import com.xian.menu.pojo.Menu;
import com.xian.menu.service.MenuService;
import com.xian.menu.vo.ImpowerVo;
import com.xian.roleinfo.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired(required = false)
    MenuMapper menuMapper;

    /*查询所有菜单*/
    @Transactional
    public List<MenuDto> selectAllMenu(Integer roleId) {
        return menuMapper.selectAllMenu(roleId);
    }

    /*添加菜单*/
    @Transactional
    public Integer addMenu(Menu menu) {
        return menuMapper.addMenu(menu);
    }
    /*动态查询菜单(if)(模糊查询)*/
    @Transactional
    public List<Menu> selectMenuInfoBy(Menu menu) {
        return menuMapper.selectMenuInfoBy(menu);
    }
    /* if+where语句(查询)(具体查询一个对象)*/
    @Transactional
    public Menu selectMenuBy1(Menu menu) {
        return menuMapper.selectMenuBy1(menu);
    }
    /* 修改菜单*/
    @Transactional
    public Integer updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu);
    }
    /* 删除菜单*/
    @Transactional(rollbackFor=Exception.class)
    public Integer deleteMenuById(Integer id) {
        return menuMapper.deleteMenuById(id);
    }
    /*根据roleId删除中间表信息*/
    /*根据roleId和menus循环插入中间表数据*/
    @Transactional
    public void batchSave(ImpowerVo impowerVo) {
        if(impowerVo.getMenus().size()!=0){
            menuMapper.deleteRoleMenuByRoleId(impowerVo.getRoleId());
            menuMapper.batchSave(impowerVo);
        }else {
            menuMapper.deleteRoleMenuByRoleId(impowerVo.getRoleId());
        }
    }
    /*菜单维护(单表)*/
    public List<MenuDto> selectAllMenuOnly() {
        return menuMapper.selectAllMenuOnly();
    }
    /*单表查询所有菜单*/
    public List<Menu> selectAllMenus() {
        return menuMapper.selectAllMenus();
    }
    /*动态菜单显示,根据userId查询出所有的角色roleId,再根据roleId查出menu信息*/
    public List<MenuDto> selectUser_Role_Menu(UserRoleVo userRoleVo) {
        return menuMapper.selectUser_Role_Menu(userRoleVo);
    }

}

