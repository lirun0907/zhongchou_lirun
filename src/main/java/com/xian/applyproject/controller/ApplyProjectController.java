package com.xian.applyproject.controller;

import com.xian.applyproject.pojo.ApplyProject;
import com.xian.applyproject.service.ApplyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ApplyProjectController {
    @Autowired
    ApplyProjectService applyProjectService;
    @RequestMapping("addApplyProject")
    public Object addApplyProject(HttpSession session) throws IOException {

        ApplyProject applyProject = (ApplyProject)session.getAttribute("applyProject");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd : hh_MM_ss");
        Date date = new Date();
        String date1 = simpleDateFormat.format(date);
        applyProject.setCreateTime(date1);
//        System.out.println("添加筹资项目时的对象"+applyProject);
        return applyProjectService.addApplyProject(applyProject);
    }
/*筹资项目图片信息存session*/
    @RequestMapping("applyProjectSession")
    public Object applyProjectSession(HttpServletRequest request, @RequestParam("projectHeader") MultipartFile projectHeader,@RequestParam("projectDetails") MultipartFile projectDetails, HttpSession session) throws IOException {
        String projectHeader1="E:\\ideaprj\\zhongchou_lirun\\src\\main\\webapp\\idPhoto\\"+new Date().getTime()+projectHeader.getOriginalFilename();
        File newFile=new File(projectHeader1);
        projectHeader.transferTo(newFile);
        String projectHeader2 = projectHeader1.substring(projectHeader1.indexOf("idPhoto\\"));


        String projectDetails1="E:\\ideaprj\\zhongchou_lirun\\src\\main\\webapp\\idPhoto\\"+new Date().getTime()+projectDetails.getOriginalFilename();
        File newFile1=new File(projectDetails1);
        projectDetails.transferTo(newFile1);
        String projectDetails2 = projectDetails1.substring(projectDetails1.indexOf("idPhoto\\"));



       /* session.setAttribute("projectHeader",projectHeader1);
        session.setAttribute("projectDetails",projectDetails1);*/
        String applyProjectName=request.getParameter("applyProjectName");
        String applyProjectType = request.getParameter("applyProjectType");
        String projectIntro = request.getParameter("projectIntro");
        String financingMoney1 = request.getParameter("financingMoney");
        Integer financingMoney = Integer.valueOf(financingMoney1)>0?Integer.valueOf(financingMoney1):10000;
        String day1 = request.getParameter("day");
        Integer day = Integer.valueOf(day1)>0?Integer.valueOf(day1):30;
        String selfIntroduction = request.getParameter("selfIntroduction");
        String detailedIntroduction = request.getParameter("detailedIntroduction");
        String telephone = request.getParameter("telephone");
        String customerTel = request.getParameter("customerTel");
        String account = request.getParameter("account");
        ApplyProject applyProject = new ApplyProject();

        applyProject.setApplyProjectName(applyProjectName);
        applyProject.setApplyProjectType(applyProjectType);
        applyProject.setProjectIntro(projectIntro);
        applyProject.setFinancingMoney(financingMoney);
        applyProject.setDay(day);
        applyProject.setSelfIntroduction(selfIntroduction);
        applyProject.setDetailedIntroduction(detailedIntroduction);
        applyProject.setTelephone(telephone);
        applyProject.setCustomerTel(customerTel);
        applyProject.setAccount(account);
        applyProject.setProjectHeader(projectHeader2);
        applyProject.setProjectDetails(projectDetails2);
        session.setAttribute("applyProject",applyProject);
//        System.out.println("session中的"+applyProject);
        return true;
    }
}
