package com.jlnku.dwkj.dao.impl;

import com.jlnku.dwkj.dao.UserDao;
import com.jlnku.dwkj.entity.User;
import com.jlnku.dwkj.util.DbcpUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao {

    @Override
    public ArrayList<User> listUser(String user, String password) {


        try {
            Connection conn = DbcpUtil.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
    //登录验证
    @Override
    public User getPower(String user, String password) {

        String sql = "select * from user where user = '%s' and password = '%s'";
        sql=String.format(sql, user,password);
        System.out.println("SQL--------------------------------------------\n"+sql);
        User u = new User();

        try {
            Connection conn = DbcpUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                u.setId(rs.getInt(1));
                u.setUser(rs.getString(2));
                u.setPassword(rs.getString(3));;
                u.setPower(rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(u);

        if (u.getPower()!=null){
            return  u;
        }else {
            return null;
        }

    }
}
