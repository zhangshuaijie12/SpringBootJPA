package com.cn.springbootjpa;

import com.cn.springbootjpa.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjpaApplicationTests {

    @Test
    public void contextLoads() {
        List<User> list=new ArrayList<User>();
        User u1=new User();
        u1.setId(1);
        u1.setUsername("张三");
        User u2=new User();
        u2.setId(2);
        u2.setUsername("王五");
        User u3=new User();
        u3.setId(3);
        u3.setUsername("赵四");
        list.add(u1);
        list.add(u2);
        list.add(u3);

        List<User> list2= Arrays.asList(u1,u2,u3);

        //jdk8之前
        System.out.println("java 8 前");
        for (User user: list
             ) {
            System.out.println(user.getId()+"--"+user.getUsername());
            
        }
        // java 8 lambda
        System.out.println("java 8 lambda");
        list.forEach(user -> System.out.println(user.getId()+"--"+user.getUsername()));

        // java 8 stream lambda
        System.out.println("java 8 stream lambda");
        list.stream().forEach(user -> System.out.println(user.getId()+"--"+user.getUsername()));



    }

}
