package com.jlnku.dwkj.dao;

import com.jlnku.dwkj.entity.User;

import java.util.ArrayList;

public interface UserDao {
    ArrayList<User> listUser(String user, String password);

    int getPower(String user, String password);
}
