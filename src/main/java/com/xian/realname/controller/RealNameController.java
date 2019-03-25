package com.xian.realname.controller;

import com.xian.realname.service.RealNameService;
import com.xian.realname.pojo.RealName;
import com.xian.userinfo.pojo.UserInfo;
import com.xian.utils.EmailUtils;
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
public class RealNameController {
    @Autowired(required = false)
    RealNameService realNameService;
    /*上传文件*/
    @RequestMapping("fileUpload")
    public Object fileUpload(HttpServletRequest request, @RequestParam("file") MultipartFile file, HttpSession session) throws IOException {
        String realname = request.getParameter("realname");
//        System.out.println("实名"+realname);
        String cardnum = request.getParameter("cardnum");
        String tel = request.getParameter("tel");
        UserInfo userInfo=(UserInfo)session.getAttribute("userInfo");
//        System.out.println(userInfo);
        String account = userInfo.getAccount();
        long startTime=System.currentTimeMillis();
//        System.out.println("fileName："+file.getOriginalFilename());
        String path="E:\\ideaprj\\zhongchou_lirun\\src\\main\\webapp\\idPhoto\\"+new Date().getTime()+file.getOriginalFilename();
        File newFile=new File(path);
        file.transferTo(newFile);
        long  endTime=System.currentTimeMillis();
        System.out.println("运行时间："+String.valueOf(endTime-startTime)+"ms");
        RealName realName = new RealName();
        realName.setAccount(account);
        realName.setIdCard(cardnum);
        realName.setTel(tel);
        realName.setIdPhoto(path);
        realName.setRealName(realname);
        session.setAttribute("realName",realName);
//        realNameService.addRealName(realName);
        return true;
    }
    @RequestMapping("getAllRealName")
    public Object getAllRealName(){
        return realNameService.getAllRealName();
    }
    /*根据id修改状态*/
    @RequestMapping("updateRealNameById")
    public Object updateRealNameById(@RequestBody RealName realName){
        System.out.println(realName);
        return realNameService.updateRealNameById(realName);
    }
    /*根据account查询资质认真状态*/
    @RequestMapping("selectRealNameStatus")
    public Object selectRealNameStatus(HttpSession session){
        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
        String account = userInfo.getAccount();
        return realNameService.selectStatusByAccount(account);
    }
    /*邮箱验证*/
    @RequestMapping("sendEmailCode")
    public Integer sendEmailCode(@RequestParam String email){
        System.out.println(email);
        Integer random = EmailUtils.emailCode(email);
        System.out.println(random);
        return random;
    }
    /*添加实名认证的信息*/
    @RequestMapping("addRealName")
    public Integer addRealName(HttpSession session){
        RealName realName = (RealName) session.getAttribute("realName");
        return realNameService.addRealName(realName);
    }

}
