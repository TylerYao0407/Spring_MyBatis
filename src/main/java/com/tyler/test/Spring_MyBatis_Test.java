package com.tyler.test;

import com.tyler.model.User;
import com.tyler.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tyler on 2016/12/21.
 */
public class Spring_MyBatis_Test {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = userService.selectByPrimaryKey(2);
         System.out.println(user.getName());
    }
}
