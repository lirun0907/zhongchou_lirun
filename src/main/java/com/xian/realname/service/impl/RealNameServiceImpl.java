package com.xian.realname.service.impl;

import com.xian.realname.service.RealNameService;
import com.xian.realname.mapper.RealNameMapper;
import com.xian.realname.pojo.RealName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealNameServiceImpl implements RealNameService {
    @Autowired
    RealNameMapper realNameMapper;

    public Integer addRealName(RealName realName) {
        return realNameMapper.addRealName(realName);
    }

    public List<RealName> getAllRealName() {
        return realNameMapper.getAllRealName();
    }
    /*根据id修改状态*/
    public Integer updateRealNameById(RealName realName) {
        return realNameMapper.updateRealNameById(realName);
    }
    /*根据account查询资质认真状态*/
    public RealName selectStatusByAccount(String account) {
        return realNameMapper.selectStatusByAccount(account);
    }
}
