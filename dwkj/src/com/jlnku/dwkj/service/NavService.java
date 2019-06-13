package com.jlnku.dwkj.service;

import com.jlnku.dwkj.entity.Category;

import java.util.ArrayList;

public interface NavService {
    ArrayList<Category> listCategory();

    int deleteCategory(String  id);

    int updataCategory(String id,String name, String lead , String servlet);

    ArrayList<Category> listCategoryLead();
}
