package com.xian.applyproject.service.impl;

import com.xian.applyproject.mapper.ApplyProjectMapper;
import com.xian.applyproject.pojo.ApplyProject;
import com.xian.applyproject.service.ApplyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyProjectServiceImpl implements ApplyProjectService {
    @Autowired
    ApplyProjectMapper applyProjectMapper;
    /*添加项目申请*/
    public Integer addApplyProject(ApplyProject applyProject) {
        return applyProjectMapper.addApplyProject(applyProject);
    }
    /*查询所有*/
    public List<ApplyProject> getAllApplyProject() {
        return applyProjectMapper.getAllApplyProject();
    }
    /*修改*/
    public Integer updateApplyProjectById(ApplyProject applyProject) {
        return applyProjectMapper.updateApplyProjectById(applyProject);
    }
    /*根据审核状态查询已通过的所有项目*/
    public List<ApplyProject> selectApplyProjectByStatus() {
        return applyProjectMapper.selectApplyProjectByStatus();
    }
    /*根据id查询筹资项目*/
    public ApplyProject selectApplyProjectByApplyProjectId(Integer applyProjectId) {
        return applyProjectMapper.selectApplyProjectByApplyProjectId(applyProjectId);
    }
}
