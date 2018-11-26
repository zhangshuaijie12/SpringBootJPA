package com.cn.springbootjpa.controller;

import com.cn.springbootjpa.dao.UserJPA;
import com.cn.springbootjpa.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class SpringBootJpa {

    @Resource
    private UserJPA userJPA;

    /**
     * 查询所有用户列表
     * @return
     */
    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public List<User> getUserList(){
        return  userJPA.findAll();
    }

}
