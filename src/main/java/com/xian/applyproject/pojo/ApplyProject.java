package com.xian.applyproject.pojo;

public class ApplyProject {
    private Integer applyProjectId;
    private String applyProjectName;
    private String account;
    private String applyProjectType;
    private String projectIntro;
    private Integer financingMoney;
    private Integer day;
    private String projectHeader;
    private String projectDetails;
    private String selfIntroduction;
    private String  detailedIntroduction;
    private String telephone;
    private String customerTel;
    private String projectStatus="未审核";
    private Integer raiseMoney=0;
    private String createTime;

    public ApplyProject() {
    }

    public ApplyProject(Integer applyProjectId, String applyProjectName, String account, String applyProjectType, String projectIntro, Integer financingMoney, Integer day, String projectHeader, String projectDetails, String selfIntroduction, String detailedIntroduction, String telephone, String customerTel, String projectStatus, Integer raiseMoney, String createTime) {
        this.applyProjectId = applyProjectId;
        this.applyProjectName = applyProjectName;
        this.account = account;
        this.applyProjectType = applyProjectType;
        this.projectIntro = projectIntro;
        this.financingMoney = financingMoney;
        this.day = day;
        this.projectHeader = projectHeader;
        this.projectDetails = projectDetails;
        this.selfIntroduction = selfIntroduction;
        this.detailedIntroduction = detailedIntroduction;
        this.telephone = telephone;
        this.customerTel = customerTel;
        this.projectStatus = projectStatus;
        this.raiseMoney = raiseMoney;
        this.createTime = createTime;
    }

    public Integer getApplyProjectId() {
        return applyProjectId;
    }

    public void setApplyProjectId(Integer applyProjectId) {
        this.applyProjectId = applyProjectId;
    }

    public String getApplyProjectName() {
        return applyProjectName;
    }

    public void setApplyProjectName(String applyProjectName) {
        this.applyProjectName = applyProjectName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getApplyProjectType() {
        return applyProjectType;
    }

    public void setApplyProjectType(String applyProjectType) {
        this.applyProjectType = applyProjectType;
    }

    public String getProjectIntro() {
        return projectIntro;
    }

    public void setProjectIntro(String projectIntro) {
        this.projectIntro = projectIntro;
    }

    public Integer getFinancingMoney() {
        return financingMoney;
    }

    public void setFinancingMoney(Integer financingMoney) {
        this.financingMoney = financingMoney;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getProjectHeader() {
        return projectHeader;
    }

    public void setProjectHeader(String projectHeader) {
        this.projectHeader = projectHeader;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public String getDetailedIntroduction() {
        return detailedIntroduction;
    }

    public void setDetailedIntroduction(String detailedIntroduction) {
        this.detailedIntroduction = detailedIntroduction;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Integer getRaiseMoney() {
        return raiseMoney;
    }

    public void setRaiseMoney(Integer raiseMoney) {
        this.raiseMoney = raiseMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ApplyProject{" +
                "applyProjectId=" + applyProjectId +
                ", applyProjectName='" + applyProjectName + '\'' +
                ", account='" + account + '\'' +
                ", applyProjectType='" + applyProjectType + '\'' +
                ", projectIntro='" + projectIntro + '\'' +
                ", financingMoney=" + financingMoney +
                ", day=" + day +
                ", projectHeader='" + projectHeader + '\'' +
                ", projectDetails='" + projectDetails + '\'' +
                ", selfIntroduction='" + selfIntroduction + '\'' +
                ", detailedIntroduction='" + detailedIntroduction + '\'' +
                ", telephone='" + telephone + '\'' +
                ", customerTel='" + customerTel + '\'' +
                ", projectStatus='" + projectStatus + '\'' +
                ", raiseMoney=" + raiseMoney +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
