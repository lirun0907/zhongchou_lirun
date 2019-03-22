package com.xian.applyproject.mapper;

import com.xian.applyproject.pojo.ApplyProject;

import java.util.List;

public interface ApplyProjectMapper {
    /*添加项目申请*/
    public Integer addApplyProject(ApplyProject applyProject);
    /*查询所有*/
    public List<ApplyProject> getAllApplyProject();
    /*修改*/
    public Integer updateApplyProjectById(ApplyProject applyProject);
    /*根据审核状态查询已通过的所有项目*/
    public List<ApplyProject> selectApplyProjectByStatus();
    /*根据id查询筹资项目*/
    public ApplyProject selectApplyProjectByApplyProjectId(Integer applyProjectId);
}
