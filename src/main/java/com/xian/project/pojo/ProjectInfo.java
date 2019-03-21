package com.xian.project.pojo;

public class ProjectInfo {
    private Integer projectId;
    private String projectName;
    private String projectInfo;

    public ProjectInfo() {
    }

    public ProjectInfo(Integer projectId, String projectName, String projectInfo) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectInfo = projectInfo;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectInfo='" + projectInfo + '\'' +
                '}';
    }
}
