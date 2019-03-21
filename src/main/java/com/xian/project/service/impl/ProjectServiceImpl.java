package com.xian.project.service.impl;

import com.xian.project.mapper.ProjectMapper;
import com.xian.project.pojo.ProjectInfo;
import com.xian.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired(required = false)
    ProjectMapper projectMapper;
    /*查询所有*/
    public List<ProjectInfo> selectAllProject() {
        return projectMapper.selectAllProject();
    }
    /*增加项目类型*/
    public Integer addProject(ProjectInfo projectInfo) {
        return projectMapper.addProject(projectInfo);
    }
    /*根据id查询一个项目类型*/
    public ProjectInfo selectProjectById(Integer projectId) {
        return projectMapper.selectProjectById(projectId);
    }
    /*根据id修改项目类型*/
    public Integer updateProjectById(ProjectInfo projectInfo) {
        return projectMapper.updateProjectById(projectInfo);
    }
    /*根据id删除项目类型*/
    public Integer deleteProjectById(Integer projectId) {
        return projectMapper.deleteProjectById(projectId);
    }
    /*模糊查询*/
    public List<ProjectInfo> selectProjectBy(ProjectInfo projectInfo) {
        return projectMapper.selectProjectBy(projectInfo);
    }

}
