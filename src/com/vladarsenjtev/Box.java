package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void addListFruit(List<T> fruitList) {
        fruits.addAll(fruitList);
    }

    public List<T> getFruits() {
        return fruits;
    }

    public int getWeight() {
        int allWeight = 0;
        for (Fruit fruit : fruits) {
            allWeight += fruit.getWeight();
        }
        return allWeight;
    }

    public boolean compare(Box box) {
        return box.getWeight() == getWeight();
    }

    public void merge(Box <T> box) {
        fruits.addAll(box.getFruits());
        box.getFruits().clear();
    }
}

