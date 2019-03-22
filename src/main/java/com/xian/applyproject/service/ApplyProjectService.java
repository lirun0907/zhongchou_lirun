package com.xian.applyproject.service;

import com.xian.applyproject.pojo.ApplyProject;

import java.util.List;

public interface ApplyProjectService {
    /*添加项目申请*/
    public Integer addApplyProject(ApplyProject applyProject);
    /*查询所有*/
    public List<ApplyProject> getAllApplyProject();
    /*修改*/
    public Integer updateApplyProjectById(ApplyProject applyProject);
}
