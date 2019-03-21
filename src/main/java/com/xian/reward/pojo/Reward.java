package com.xian.reward.pojo;

public class Reward {
    private Integer rewardId;
    private String applyProjectName;
    private String rewardType;
    private Integer payMoney;
    private String rewardContent;
    private String explainPhoto;
    private Integer rewardNumber;
    private Integer limitNumber;
    private Integer freight;
    private String invoice;
    private Integer rewardTime;

    public Reward() {
    }

    public Reward(Integer rewardId, String applyProjectName, String rewardType, Integer payMoney, String rewardContent, String explainPhoto, Integer rewardNumber, Integer limitNumber, Integer freight, String invoice, Integer rewardTime) {
        this.rewardId = rewardId;
        this.applyProjectName = applyProjectName;
        this.rewardType = rewardType;
        this.payMoney = payMoney;
        this.rewardContent = rewardContent;
        this.explainPhoto = explainPhoto;
        this.rewardNumber = rewardNumber;
        this.limitNumber = limitNumber;
        this.freight = freight;
        this.invoice = invoice;
        this.rewardTime = rewardTime;
    }

    public Integer getRewardId() {
        return rewardId;
    }

    public void setRewardId(Integer rewardId) {
        this.rewardId = rewardId;
    }

    public String getApplyProjectName() {
        return applyProjectName;
    }

    public void setApplyProjectName(String applyProjectName) {
        this.applyProjectName = applyProjectName;
    }

    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public String getRewardContent() {
        return rewardContent;
    }

    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent;
    }

    public String getExplainPhoto() {
        return explainPhoto;
    }

    public void setExplainPhoto(String explainPhoto) {
        this.explainPhoto = explainPhoto;
    }

    public Integer getRewardNumber() {
        return rewardNumber;
    }

    public void setRewardNumber(Integer rewardNumber) {
        this.rewardNumber = rewardNumber;
    }

    public Integer getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(Integer limitNumber) {
        this.limitNumber = limitNumber;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public Integer getRewardTime() {
        return rewardTime;
    }

    public void setRewardTime(Integer rewardTime) {
        this.rewardTime = rewardTime;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "rewardId=" + rewardId +
                ", applyProjectName='" + applyProjectName + '\'' +
                ", rewardType='" + rewardType + '\'' +
                ", payMoney=" + payMoney +
                ", rewardContent='" + rewardContent + '\'' +
                ", explainPhoto='" + explainPhoto + '\'' +
                ", rewardNumber=" + rewardNumber +
                ", limitNumber=" + limitNumber +
                ", freight=" + freight +
                ", invoice='" + invoice + '\'' +
                ", rewardTime=" + rewardTime +
                '}';
    }
}
