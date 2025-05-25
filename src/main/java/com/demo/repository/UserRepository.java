package com.demo.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    UserRepository()
    {
        System.out.println("UserRepository:: Constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("UserRepository:: init() method called");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("UserRepository:: destroy() method called");
    }

}
