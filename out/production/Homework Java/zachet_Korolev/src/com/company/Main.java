package com.company;

public class Main {

    public static void main(String[] args) {

        TShirt tee = new TShirt("M", 500, "black");
        tee.dressMan();
        tee.dressWoman();

        Tie tie = new Tie("no size", 2000, "red");
        tie.dressMan();

        Skirt skirt = new Skirt("XXS", 2000, "red");
        skirt.dressWoman();

        Trousers trousers = new Trousers("XL", 1990, "blue");
        trousers.dressMan();
        trousers.dressWoman();

        ClothSize size = new ClothSize("XXS", 32);
        System.out.println(size.size);

    }
}

enum Size{
    XXS("32"), XS("34"), S("36"), M("38"), L("40");
    private String euroSize;
    Size(String euroSize){
        this.euroSize = euroSize;
    }
    public String euroSize(){
        return euroSize;
    }
}
