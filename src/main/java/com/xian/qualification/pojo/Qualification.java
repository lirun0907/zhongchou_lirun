package com.xian.qualification.pojo;

public class Qualification {
    private Integer quaId;
    private String quaName;

    public Qualification() {
    }

    public Qualification(Integer quaId, String quaName) {
        this.quaId = quaId;
        this.quaName = quaName;
    }

    public Integer getQuaId() {
        return quaId;
    }

    public void setQuaId(Integer quaId) {
        this.quaId = quaId;
    }

    public String getQuaName() {
        return quaName;
    }

    public void setQuaName(String quaName) {
        this.quaName = quaName;
    }

    @Override
    public String toString() {
        return "Qualification{" +
                "quaId=" + quaId +
                ", quaName='" + quaName + '\'' +
                '}';
    }
}
