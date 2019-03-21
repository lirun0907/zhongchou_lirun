package com.xian.reward.controller;

import com.xian.reward.pojo.Reward;
import com.xian.reward.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
public class RewardController {
    @Autowired
    RewardService rewardService;
    /*添加*/
    @RequestMapping("addReward")
    public Object addReward(@RequestBody Reward reward,HttpSession session){
        System.out.println(reward);
        String explainPhoto = (String)session.getAttribute("explainPhoto");
        System.out.println(explainPhoto);
        reward.setExplainPhoto(explainPhoto);
        reward.setApplyProjectName("手机");
        return rewardService.addReward(reward);
    }
    /*查询所有*/
    @RequestMapping("selectAllReward")
    public Object selectAllReward(@RequestParam String applyProjectName){
        return rewardService.selectAllReward(applyProjectName);
    }
    /*把图片保存*/
    @RequestMapping("saveFile")
    public void saveFile(@RequestParam("explainPhoto") MultipartFile explainPhoto, HttpSession session) throws IOException {
        String path="E:\\ideaprj\\zhongchou_lirun\\src\\main\\webapp\\idPhoto\\"+new Date().getTime()+explainPhoto.getOriginalFilename();
        File newFile=new File(path);
        explainPhoto.transferTo(newFile);
        String path2 = path.substring(path.indexOf("idPhoto\\"));
        session.setAttribute("explainPhoto",path2);
        System.out.println(path2);
    }
}
