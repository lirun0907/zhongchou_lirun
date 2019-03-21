package com.xian.realname.service;

import com.xian.realname.pojo.RealName;

import java.util.List;

public interface RealNameService {
    public Integer addRealName(RealName realName);
    public List<RealName> getAllRealName( );
    /*根据id修改状态*/
    public Integer updateRealNameById(RealName realName);
    /*根据account查询资质认真状态*/
    public RealName selectStatusByAccount(String account);
}
