package com.xian.project.service.impl;

import com.xian.project.service.ProjectService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ProjectServiceImplTest {

    @Test
    public void selectAllProject() {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        ProjectService bean = classPathXmlApplicationContext.getBean(ProjectService.class);
        System.out.println(bean.selectAllProject());

    }
}