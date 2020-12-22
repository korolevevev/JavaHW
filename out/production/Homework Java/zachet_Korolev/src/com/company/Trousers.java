package com.company;

public class Trousers extends Clothes implements MensWear, WomensWear{

    String sex;

    protected Trousers(String size, int price, String color) {
        super(size, price, color);
        this.sex = sex;
    }

    public void dressMan() {
        System.out.println("Man dressed trousers!");
    }

    public void dressWoman() {
        System.out.println("Woman dressed trousers!");
    }

    public String getGender() {
        return this.sex;
    }
}
