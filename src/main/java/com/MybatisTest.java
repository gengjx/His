package com;

import com.gjxsoft.domain.Department;
import com.gjxsoft.domain.Rule;
import com.gjxsoft.domain.User;
import com.gjxsoft.service.DepartmentService;
import com.gjxsoft.service.RuleService;
import com.gjxsoft.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MybatisTest {
    private ApplicationContext applicationContext;
    @Autowired
    private RuleService userService;
    @Autowired
    private DepartmentService departmentService;

    @Test
    public void testMybatis(){
        applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        userService =applicationContext.getBean("ruleService", RuleService.class);

        List<Rule> rules =userService.findAll();
        System.out.println(rules);


    }


    @Test
    public void testMybatis2(){
        applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        departmentService =applicationContext.getBean("departmentService", DepartmentService.class);

        List<Department> departments =departmentService.findAllDepart();
        System.out.println(departments);


    }
}
