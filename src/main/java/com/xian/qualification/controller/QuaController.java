package com.xian.qualification.controller;

import com.xian.project.pojo.ProjectInfo;
import com.xian.qualification.pojo.Qualification;
import com.xian.qualification.service.QuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuaController {
    @Autowired
    QuaService quaService;
    /*查询所有*/
    @RequestMapping("selectAllQua")
    public List<Qualification> selectAllQua() {
        return quaService.selectAllQua();
    }
    /*增加项目类型*/
    @RequestMapping("addQua")
    public Integer addQua(@RequestBody Qualification qualification) {
        return quaService.addQua(qualification);
    }
    /*根据id查询一个项目类型*/
    @RequestMapping("selectQuaById")
    public Qualification selectQuaById(@RequestParam Integer quaId) {
        Qualification qualification=quaService.selectQuaById(quaId);
        return qualification;
    }
    /*根据id修改项目类型*/
    @RequestMapping("updateQuaById")
    public Integer updateQuaById(@RequestBody Qualification qualification) {
        return quaService.updateQuaById(qualification);
    }
    /*根据id删除项目类型*/
    @RequestMapping("deleteQuaById")
    public Integer deleteQuaById(@RequestParam Integer quaId) {
        return quaService.deleteQuaById(quaId);
    }
    /*模糊查询*/
    @RequestMapping("selectQuaBy")
    public List<Qualification> selectQuaBy(@RequestBody Qualification qualification) {
//        System.out.println(projectInfo);
        return quaService.selectQuaBy(qualification);
    }
}
