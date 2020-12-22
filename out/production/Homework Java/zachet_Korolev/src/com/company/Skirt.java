package com.company;

public class Skirt extends Clothes implements WomensWear{


    protected Skirt(String size, int price, String color) {
        super(size, price, color);
    }

    public void dressWoman() {
        System.out.println("Woman dressed skirt!");
    }
}
