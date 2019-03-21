package com.xian.applyproject.service.impl;

import com.xian.applyproject.pojo.ApplyProject;
import com.xian.applyproject.service.ApplyProjectService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ApplyProjectServiceImplTest {

    @Test
    public void addApplyProject() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        ApplyProjectService bean = classPathXmlApplicationContext.getBean(ApplyProjectService.class);
        ApplyProject applyProject = new ApplyProject(1,"asd","asd","s","re",100,30,"rt","hfg","yu","ewr","ret","ret","yu",45,"bvb");
        bean.addApplyProject(applyProject);
        
    }
}