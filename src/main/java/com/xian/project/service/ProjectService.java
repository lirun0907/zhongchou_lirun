package com.xian.project.service;

import com.xian.project.pojo.ProjectInfo;

import java.util.List;

public interface ProjectService {
    /*查询所有*/
    public List<ProjectInfo> selectAllProject();
    /*增加项目类型*/
    public Integer addProject(ProjectInfo projectInfo);
    /*根据id查询一个项目类型*/
    public ProjectInfo selectProjectById(Integer projectId);
    /*根据id修改项目类型*/
    public Integer updateProjectById(ProjectInfo projectInfo);
    /*根据id删除项目类型*/
    public Integer deleteProjectById(Integer projectId);
    /*模糊查询*/
    public List<ProjectInfo> selectProjectBy(ProjectInfo projectInfo);
}
