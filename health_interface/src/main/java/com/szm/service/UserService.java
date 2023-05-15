package com.szm.service;

import com.szm.pojo.User;

public interface UserService {
    public User findByUsername(String username);
}
