package com.example.models;

import java.util.ArrayList;

public class ListCustomer {
    private ArrayList<Customer> customers;

    public ListCustomer() {
        customers=new ArrayList<>();
    }
    public void addCustomer(Customer c)
    {
        customers.add(c);
    }

    public ListCustomer(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    public void generate_sample_dataset() {
        addCustomer(new Customer(1,"Teo","teo@gmail.com","0983456782","teo","123"));
        addCustomer(new Customer(2,"Ty","ty@gmail.com","0814567821","ty","456"));
        addCustomer(new Customer(3,"Linda","linda@gmail.com","0815379821","linda","45678"));
        addCustomer(new Customer(4,"Nhi","nhi@gmail.com","0974567821","nhinee","789"));
        addCustomer(new Customer(5,"Ngan","ngan@gmail.com","0814591456","ngan","101112"));
        addCustomer(new Customer(6,"Yen","yen@gmail.com","0986567821","yenn","131415"));
        addCustomer(new Customer(7,"Dung","dung@gmail.com","08145687821","dung","161718"));
        addCustomer(new Customer(8,"Tuan","tuan@gmail.com","08123456521","tuan","192021"));
        addCustomer(new Customer(9,"Thinh","thinh11@gmail.com","0963819872","thinhne","223344"));
        addCustomer(new Customer(10,"Vy","vy@gmail.com","0813444821","vy","456890"));
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
