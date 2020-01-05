package com.example.naga;

public class Product
{
    public  String name;
    public  String pro;

    public Product( )
    {

    }

    public Product(String name, String pro) {
        this.name = name;
        this.pro = pro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }
}
