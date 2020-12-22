package com.company;

public class Tie extends Clothes implements MensWear{


    protected Tie(String size, int price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Man dressed tie!");
    }
}
