package com.jlnku.dwkj.service.impl;

import com.jlnku.dwkj.dao.NavDao;
import com.jlnku.dwkj.dao.impl.NavDaoImpl;
import com.jlnku.dwkj.entity.Category;
import com.jlnku.dwkj.service.NavService;

import java.util.ArrayList;

public class NavServiceImpl implements NavService {

    NavDao navDao = new NavDaoImpl();

    @Override
    public ArrayList<Category> listCategory() {
        ArrayList<Category> list = navDao.listCategory();
        return list;
    }

    @Override
    public int deleteCategory(String id) {
        int affectLine = navDao.deleteCategory(id);
        return affectLine;
    }

    @Override
    public int updataCategory(String id, String name, String lead, String servlet) {
        if (id.equals(lead)){
            System.out.println("更新失败 无法最为自己的上级");
            return 0;
        }
        int affectLine = navDao.updataCategory(id,name,lead,servlet);
        return affectLine;
    }

    @Override
    public ArrayList<Category> listCategoryLead() {
        ArrayList<Category> list = navDao.listCategoryLead();
        return list;
    }

    @Override
    public int addCategory(String name, String lead, String servlet) {
        int affectLine = navDao.addCategory(name,lead,servlet);
        return affectLine;
    }

}
