package com.jlnku.dwkj.service.impl;

import com.jlnku.dwkj.dao.UserDao;
import com.jlnku.dwkj.dao.impl.UserDaoImpl;
import com.jlnku.dwkj.entity.User;
import com.jlnku.dwkj.service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public ArrayList<User> listUser(String user, String password) {


        ArrayList<User> listUser = userDao.listUser(user,password);


        return null;
    }

    @Override
    public int getPower(String user,String password ){

        int power =  userDao.getPower(user,password);

        return power;
    }
}
