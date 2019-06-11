package com.jlnku.dwkj.service;

import com.jlnku.dwkj.entity.User;

import java.util.ArrayList;

public interface UserService {
    ArrayList<User> listUser(String user, String password);

    User getPower(String user, String password);
}
