package com.xian.reward.service.impl;

import com.xian.reward.mapper.RewardMapper;
import com.xian.reward.pojo.Reward;
import com.xian.reward.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardServiceImpl implements RewardService {
    @Autowired
    RewardMapper rewardMapper;
    /*添加*/
    public Integer addReward(Reward reward) {
        return rewardMapper.addReward(reward);
    }
    /*查询所有*/
    public List<Reward> selectAllReward(String applyProjectName) {
        return rewardMapper.selectAllReward(applyProjectName);
    }
    /* 根据id查询回报信息*/
    public Reward selectRewardById(Integer rewardId) {
        return rewardMapper.selectRewardById(rewardId);
    }
}
