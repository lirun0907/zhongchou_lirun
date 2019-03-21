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
import java.util.Date;

@RestController
public class ApplyProjectController {
    @Autowired
    ApplyProjectService applyProjectService;
    @RequestMapping("addApplyProject")
    public Object addApplyProject(HttpSession session) throws IOException {
        MultipartFile projectHeader = (MultipartFile)session.getAttribute("projectHeader");
        String path="E:\\ideaprj\\zhongchou_lirun\\src\\main\\webapp\\idPhoto\\"+new Date().getTime()+projectHeader.getOriginalFilename();
        File newFile=new File(path);
        projectHeader.transferTo(newFile);

        MultipartFile projectDetails = (MultipartFile)session.getAttribute("projectDetails");
        String path2="E:\\ideaprj\\zhongchou_lirun\\src\\main\\webapp\\idPhoto\\"+new Date().getTime()+projectDetails.getOriginalFilename();
        File newFile2=new File(path);
        projectDetails.transferTo(newFile);

        ApplyProject applyProject = (ApplyProject)session.getAttribute("applyProject");
        applyProject.setProjectHeader(path);
        applyProject.setProjectDetails(path2);
        return applyProjectService.addApplyProject(applyProject);
    }
/*筹资项目图片信息存session*/
    @RequestMapping("applyProjectSession")
    public Object applyProjectSession(HttpServletRequest request, @RequestParam("projectHeader") MultipartFile projectHeader,@RequestParam("projectDetails") MultipartFile projectDetails, HttpSession session){
        session.setAttribute("projectHeader",projectHeader);
        session.setAttribute("projectDetails",projectDetails);
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
        session.setAttribute("applyProject",applyProject);
//        System.out.println("11"+applyProject);
        return true;
    }
    /*从session中取出筹资项目图片信息*/
    @RequestMapping("getApplyProjectSession")
    public Object getApplyProjectSession(HttpSession session){
        MultipartFile projectHeader = (MultipartFile)session.getAttribute("projectHeader");
        MultipartFile projectDetails = (MultipartFile)session.getAttribute("projectDetails");
        ApplyProject applyProject = (ApplyProject) session.getAttribute("applyProject");
//        System.out.println(projectHeader.getOriginalFilename());
//        System.out.println(projectDetails.getOriginalFilename());
//        System.out.println("22"+applyProject);
        return true;
    }
}
