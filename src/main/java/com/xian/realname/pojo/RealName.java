package com.xian.realname.pojo;

public class RealName {
    private Integer realNameId;
    private String processName="实名认证审批流程";
    private String account;
    private String realName;
    private String idCard;
    private String tel;
    private String idPhoto;
    private String status="待审核";

    public RealName() {
    }

    public RealName(Integer realNameId, String processName, String account, String realName, String idCard, String tel, String idPhoto, String status) {
        this.realNameId = realNameId;
        this.processName = processName;
        this.account = account;
        this.realName = realName;
        this.idCard = idCard;
        this.tel = tel;
        this.idPhoto = idPhoto;
        this.status = status;
    }

    public RealName(String processName, String account, String realName, String idCard, String tel, String idPhoto, String status) {
        this.processName = processName;
        this.account = account;
        this.realName = realName;
        this.idCard = idCard;
        this.tel = tel;
        this.idPhoto = idPhoto;
        this.status = status;
    }

    public Integer getRealNameId() {
        return realNameId;
    }

    public void setRealNameId(Integer realNameId) {
        this.realNameId = realNameId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RealName{" +
                "realNameId=" + realNameId +
                ", processName='" + processName + '\'' +
                ", account='" + account + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", tel='" + tel + '\'' +
                ", idPhoto='" + idPhoto + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
