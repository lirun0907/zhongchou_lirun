package com.xian.qualification.mapper;

import com.xian.project.pojo.ProjectInfo;
import com.xian.qualification.pojo.Qualification;

import java.util.List;

public interface QuaMapper {
    /*查询所有*/
    public List<Qualification> selectAllQua();
    /*增加资质名称*/
    public Integer addQua(Qualification qualification);
    /*根据id查询一个资质名称*/
    public Qualification selectQuaById(Integer QuaId);
    /*根据id修改资质名称*/
    public Integer updateQuaById(Qualification qualification);
    /*根据id删除资质名称*/
    public Integer deleteQuaById(Integer QuaId);
    /*模糊查询*/
    public List<Qualification> selectQuaBy(Qualification qualification);
}
