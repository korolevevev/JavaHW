package com.company;

public class TShirt extends Clothes implements MensWear, WomensWear{

    String sex;

    protected TShirt(String size, int price, String color) {
        super(size, price, color);
        this.sex = sex;
    }

    public void dressMan() {
        System.out.println("Man dressed t-shirt!");
    }

    public void dressWoman() {
        System.out.println("Woman dressed t-shirt!");
    }

    public String getGender() {
        return this.sex;
    }
}
