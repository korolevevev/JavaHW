package com.company;

public class Clothes {

    private String size;
    private int price;
    private String color;

    protected Clothes(String size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getSize(){
        return size;
    }

    public int getPrice(){
        return price;
    }

    public String getColor(){
        return color;
    }

}
