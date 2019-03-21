package com.xian.applyproject.service.impl;

import com.xian.applyproject.mapper.ApplyProjectMapper;
import com.xian.applyproject.pojo.ApplyProject;
import com.xian.applyproject.service.ApplyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyProjectServiceImpl implements ApplyProjectService {
    @Autowired
    ApplyProjectMapper applyProjectMapper;
    /*添加项目申请*/
    public Integer addApplyProject(ApplyProject applyProject) {
        return applyProjectMapper.addApplyProject(applyProject);
    }
}
