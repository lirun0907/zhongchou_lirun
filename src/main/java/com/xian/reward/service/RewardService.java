package com.xian.reward.service;

import com.xian.reward.pojo.Reward;

import java.util.List;

public interface RewardService {
    /*添加*/
    public Integer addReward(Reward reward);
    /*查询所有*/
    public List<Reward> selectAllReward(String applyProjectName);
}
