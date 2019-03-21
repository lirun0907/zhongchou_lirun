package com.xian.qualification.service.impl;

import com.xian.qualification.mapper.QuaMapper;
import com.xian.qualification.pojo.Qualification;
import com.xian.qualification.service.QuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuaServiceImpl implements QuaService {
    @Autowired(required = false)
    QuaMapper quaMapper;
    /*查询所有*/
    public List<Qualification> selectAllQua() {
        return quaMapper.selectAllQua();
    }
    /*增加资质名称*/
    public Integer addQua(Qualification qualification) {
        return quaMapper.addQua(qualification);
    }
    /*根据id查询一个资质名称*/
    public Qualification selectQuaById(Integer QuaId) {
        return quaMapper.selectQuaById(QuaId);
    }
    /*根据id修改资质名称*/
    public Integer updateQuaById(Qualification qualification) {
        return quaMapper.updateQuaById(qualification);
    }
    /*根据id删除资质名称*/
    public Integer deleteQuaById(Integer QuaId) {
        return quaMapper.deleteQuaById(QuaId);
    }
    /*模糊查询*/
    public List<Qualification> selectQuaBy(Qualification qualification) {
        return quaMapper.selectQuaBy(qualification);
    }
}
