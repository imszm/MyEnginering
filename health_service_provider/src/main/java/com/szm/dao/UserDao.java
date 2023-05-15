package com.szm.dao;

import com.szm.pojo.User;

public interface UserDao {
    public User findByUsername(String username);
}
