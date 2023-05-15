package com.szm.controller;

import com.szm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

public class Test {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public Map<String,User> map = new HashMap<>();
    @org.junit.Test
    public void test(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword(passwordEncoder.encode("admin"));
        User put = map.put(user.getUsername(), user);
        System.out.println(put);
    }
}
