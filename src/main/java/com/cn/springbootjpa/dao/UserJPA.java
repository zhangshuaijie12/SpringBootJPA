package com.cn.springbootjpa.dao;

import com.cn.springbootjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;

public interface UserJPA extends JpaRepository<User, Long>,
        JpaSpecificationExecutor<User>,
        Serializable {
}
