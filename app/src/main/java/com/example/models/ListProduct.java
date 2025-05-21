package com.example.models;

import java.util.ArrayList;

public class ListProduct {
    private ArrayList<Product> products;
    public ListProduct() {
        products=new ArrayList<>();
    }
    public void addProduct(Product p)
    {
        products.add(p);
    }

    public ListProduct(ArrayList<Product> products) {
        this.products = products;
    }
    public void generate_sample_dataset() {
        addProduct(new Product(011,"Sach Toan Lop 10",100,50,01));
        addProduct(new Product(012,"Sach Van Lop 12",100,50,01));
        addProduct(new Product(013,"Sach Vat Ly Lop 12",120,40,01));
        addProduct(new Product(021,"50 De Minh Hoa Thi THPT Toan",50,100,02));
        addProduct(new Product(022,"Huong Dan On Thi Vao 10",30,90,02));
        addProduct(new Product(023,"On Ngu Phap Tieng Anh",150,150,02));
        addProduct(new Product(031,"Nguoi Giau Co Nhat Thanh Babylon",20,50,03));
        addProduct(new Product(032,"Nhung Ke Xuat Chung",30,120,03));
        addProduct(new Product(033,"Co May Tu Duy Vi Dai",40,180,03));
        addProduct(new Product(041,"Attack On Titan",200,40,04));
        addProduct(new Product(042,"Dau An Hoang Gia",150,20,04));
        addProduct(new Product(043,"Wind Breaker",200,30,04));
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
