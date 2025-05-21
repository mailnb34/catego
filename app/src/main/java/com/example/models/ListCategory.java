package com.example.models;

import java.util.ArrayList;

public class ListCategory {
    private ArrayList<Category> category;

    public ListCategory() {
        category=new ArrayList<>();
    }
    public void addCategory(Category ca)
    {
        category.add(ca);
    }

    public ListCategory(ArrayList<Category> category) {
        this.category = category;
    }
    public void generate_sample_dataset() {
        addCategory(new Category(01,"Sach Giao Khoa"));
        addCategory(new Category(02,"Sach Tham Khao"));
        addCategory(new Category(03,"Sach Kinh Te"));
        addCategory(new Category(04,"Sach Thieu Nhi"));
    }

    public ArrayList<Category> getCategory() {
        return category;
    }
}
