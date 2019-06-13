package com.jlnku.dwkj.dao;

import com.jlnku.dwkj.entity.Category;

import java.util.ArrayList;

public interface NavDao {
    ArrayList<Category> listCategory();

    int deleteCategory(String id);

    int updataCategory(String id,String name,String lead,String servlet);

    ArrayList<Category> listCategoryLead();
}
