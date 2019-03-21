package com.xian.roleinfo.service.impl;

import com.xian.roleinfo.mapper.RoleInfoMapper;
import com.xian.roleinfo.pojo.RoleInfo;
import com.xian.roleinfo.service.RoleService;
import com.xian.roleinfo.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleInfoMapper roleInfoMapper;

    public List<RoleInfo> selectAllRoleInfo() {
        return roleInfoMapper.selectAllRoleInfo();
    }

    public Integer addRoleInfo(RoleInfo roleInfo) {
        return roleInfoMapper.addRoleInfo(roleInfo);
    }

    public RoleInfo selectRoleInfoBy1(RoleInfo roleInfo) {
        return roleInfoMapper.selectRoleInfoBy1(roleInfo);
    }

    public Integer updateRoleInfoBy(RoleInfo roleInfo) {
        return roleInfoMapper.updateRoleInfoBy(roleInfo);
    }

    public void deleteRoleInfoById(Integer id) {
        roleInfoMapper.deleteRoleInfoById(id);
    }

    /*根据roleId删除roleInfo*/
    /*根据roleId删除中间表数据*/
    @Transactional
    public Boolean deleteRoleInfo_RoleMenuByRoleId(Integer roleId) {
        roleInfoMapper.deleteRoleInfoById(roleId);
        roleInfoMapper.deleteRole_MenuByRoleID(roleId);
        return true;
    }

    /*模糊查询*/
    public List<RoleInfo> selectRoleInfoBy(RoleInfo roleInfo) {
        return roleInfoMapper.selectRoleInfoBy(roleInfo);
    }

    /*两表联查被选中的角色*/
    public List<RoleInfo> selectUserinfoSelected(Integer id) {
        return roleInfoMapper.selectUserinfoSelected(id);
    }

    /*两表联查没有被选中的角色*/
    public List<RoleInfo> selectUserinfoNotSelected(Integer id) {
        return roleInfoMapper.selectUserinfoNotSelected(id);
    }

    /*根据userId删除userinfo_roleinfo中间表中的信息*/
    /*给中间表userinfo_roleinfo添加数据*/
    @Transactional
    public Boolean deleteAndAddUserinfo_Roleinfo(UserRoleVo userRoleVo) {
        roleInfoMapper.deleteUser_RoleByUserId(userRoleVo.getUserId());
        roleInfoMapper.addUserinfo_Roleinfo(userRoleVo);
        return true;
    }
}
