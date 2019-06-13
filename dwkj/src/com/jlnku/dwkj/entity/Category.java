package com.jlnku.dwkj.entity;

public class Category {

    private Integer category_id;
    private String category_name;
    private Integer category_lead;
    private String category_servlet;
    private String lead_name;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Integer getCategory_lead() {
        return category_lead;
    }

    public void setCategory_lead(Integer category_lead) {
        this.category_lead = category_lead;
    }

    public String getCategory_servlet() {
        return category_servlet;
    }

    public void setCategory_servlet(String category_servlet) {
        this.category_servlet = category_servlet;
    }

    public String getLead_name() {
        return lead_name;
    }

    public void setLead_name(String lead_name) {
        this.lead_name = lead_name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", category_lead=" + category_lead +
                ", category_servlet='" + category_servlet + '\'' +
                ", lead_name='" + lead_name + '\'' +
                '}';
    }
}
