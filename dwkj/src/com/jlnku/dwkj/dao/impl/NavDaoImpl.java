package com.jlnku.dwkj.dao.impl;

import com.jlnku.dwkj.dao.NavDao;
import com.jlnku.dwkj.entity.Category;
import com.jlnku.dwkj.util.DbcpUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NavDaoImpl implements NavDao {
    @Override
    public ArrayList<Category> listCategory() {

        String sql = "SELECT c1.* , c2.category_name FROM category c1 , category c2 WHERE c1.category_lead = c2.category_id;";

        ArrayList<Category> list = new ArrayList<Category>();

        Category category = null;

        Connection conn = null;
        try {
            conn = DbcpUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("rs is hava" +
                    rs);
            while (rs.next()){
                category = new Category();
                category.setCategory_id(rs.getInt(1));
                category.setCategory_name(rs.getString(2));
                category.setCategory_lead(rs.getInt(3));
                category.setCategory_servlet(rs.getString(4));
                category.setLead_name(rs.getString(5));
                list.add(category);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int deleteCategory(String id) {

        String sql = "delete from category where category_id ='" +
                id+"'";
        System.out.println(sql);

        Connection conn =null;
        try {
            conn=DbcpUtil.getConnection();
            Statement st = conn.createStatement();
            int affectLine = st.executeUpdate(sql);
            return affectLine;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ;
        return 0;
    }

    @Override
    public int updataCategory(String id, String name, String lead, String servlet) {
        String sql = "update category set  category_name= '%s' , category_lead='%s', category_servlet='%s' where category_id = '%s'";
        sql=String.format(sql, name,lead,servlet,id);
        System.out.println("updata sql  is =============== - "+sql);
        Connection conn = null ;
        try {
            conn=DbcpUtil.getConnection();
            Statement st = conn.createStatement();
            int affectLine = st.executeUpdate(sql);
            return affectLine;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<Category> listCategoryLead() {
        String sql = "select * from category where category_lead = 0 ";

        ArrayList<Category> list = new ArrayList<Category>();

        Category category = null;

        Connection conn = null;
        try {
            conn = DbcpUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                category = new Category();
                category.setCategory_id(rs.getInt(1));
                category.setCategory_name(rs.getString(2));
                category.setCategory_lead(rs.getInt(3));
                category.setCategory_servlet(rs.getString(4));
                list.add(category);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int addCategory(String name, String lead, String servlet) {
        String sql = "insert into category (category_name,category_lead,category_servlet) values ('%s','%s','%s')";
        sql=String.format(sql, name,lead,servlet);
        System.out.println("insert sql  is =============== - "+sql);
        Connection conn = null ;
        try {
            conn=DbcpUtil.getConnection();
            Statement st = conn.createStatement();
            int affectLine = st.executeUpdate(sql);
            return affectLine;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


}
