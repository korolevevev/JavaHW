package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        ArrayList<Integer> asdf = new ArrayList<>();
        people.add("Иван");
        LinkedList<String> peopleLinked = new LinkedList<>();


        people.add("Петр");
        people.add(1, "Сергей");
        System.out.println(people.get(1));
        for (int i=0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
        for(String person: people){
            System.out.println(person);
        }
        people.set(1, "Сергей Сергеевич");
        for(String person: people){
            System.out.println(person);
        }

        compare2Lists();
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<>(collection);
    }

    public static void compare2Lists(){
        long startTime, arrayTime, linkedTime;
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 10000;
        for(int i =0; i< N;i++){
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        startTime = System.currentTimeMillis();s
        for(int i=0; i<M;i++){
            arrayList.get((int) Math.random()*(M-1));
        }
        arrayTime = System.currentTimeMillis() - startTime;
        System.out.println(arrayTime);
        startTime = System.currentTimeMillis();
        for(int i=0; i<N;i++){
            linkedList.get((int) Math.random()*(M-1));
        }
        linkedTime = System.currentTimeMillis() - startTime;
        System.out.println(linkedTime);
        if(linkedTime < arrayTime){
            System.out.println("LinkedList быстрее");
        }
        else if(linkedTime == arrayTime){
            System.out.println("Скорость одинаковая");
        }
        else{
            System.out.println("ArrayList быстрее");
        }
    }
}
