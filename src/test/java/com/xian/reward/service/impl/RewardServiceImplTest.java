package com.xian.reward.service.impl;

import com.xian.reward.pojo.Reward;
import com.xian.reward.service.RewardService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class RewardServiceImplTest {
    @Test
    public void selectAllReward() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        RewardService bean = classPathXmlApplicationContext.getBean(RewardService.class);
        List<Reward> rewardList = bean.selectAllReward("电子手表");
        System.out.println(rewardList);
    }

    /*@Test
    public void addReward() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        RewardService bean = classPathXmlApplicationContext.getBean(RewardService.class);
        Reward reward = new Reward(1,"fd","df",6,"dfs","erew",45,12,30,"ert",20);
        bean.addReward(reward);

    }*/
}