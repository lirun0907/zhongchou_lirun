package com.xian.project.controller;

import com.xian.project.pojo.ProjectInfo;
import com.xian.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;
    /*查询所有*/
    @RequestMapping("selectAllProject")
    public List<ProjectInfo> selectAllProject() {
        return projectService.selectAllProject();
    }
    /*增加项目类型*/
    @RequestMapping("addProject")
    public Integer addProject(@RequestBody ProjectInfo projectInfo) {
        return projectService.addProject(projectInfo);
    }
    /*根据id查询一个项目类型*/
    @RequestMapping("selectProjectById")
    public ProjectInfo selectProjectById(@RequestParam Integer projectId) {
        ProjectInfo projectInfo=projectService.selectProjectById(projectId);
        return projectInfo;
    }
    /*根据id修改项目类型*/
    @RequestMapping("updateProjectById")
    public Integer updateProjectById(@RequestBody ProjectInfo projectInfo) {
        return projectService.updateProjectById(projectInfo);
    }
    /*根据id删除项目类型*/
    @RequestMapping("deleteProjectById")
    public Integer deleteProjectById(@RequestParam Integer projectId) {
        return projectService.deleteProjectById(projectId);
    }
    /*模糊查询*/
    @RequestMapping("selectProjectBy")
    public List<ProjectInfo> selectProjectBy(@RequestBody ProjectInfo projectInfo) {
//        System.out.println(projectInfo);
        return projectService.selectProjectBy(projectInfo);
    }
}
