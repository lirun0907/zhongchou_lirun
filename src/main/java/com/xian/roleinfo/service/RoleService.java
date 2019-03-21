package com.xian.roleinfo.service;

import com.xian.roleinfo.pojo.RoleInfo;
import com.xian.roleinfo.vo.UserRoleVo;

import java.util.List;

public interface RoleService {
    public List<RoleInfo> selectAllRoleInfo();
    public Integer addRoleInfo(RoleInfo roleInfo);
    public RoleInfo selectRoleInfoBy1(RoleInfo roleInfo);
    public Integer updateRoleInfoBy(RoleInfo roleInfo);
    public void deleteRoleInfoById(Integer id);
    /*根据roleId删除roleInfo*/
    /*根据roleId删除中间表数据*/
    public Boolean deleteRoleInfo_RoleMenuByRoleId(Integer roleId);
    /*模糊查询*/
    public List<RoleInfo> selectRoleInfoBy(RoleInfo roleInfo);
    /*两表联查被选中的角色*/
    public List<RoleInfo> selectUserinfoSelected(Integer id);
    /*两表联查没有被选中的角色*/
    public List<RoleInfo> selectUserinfoNotSelected(Integer id);

    /*根据userId删除userinfo_roleinfo中间表中的信息*/
    /*给中间表userinfo_roleinfo添加数据*/
    public Boolean deleteAndAddUserinfo_Roleinfo(UserRoleVo userRoleVo);
}
