package com.vladarsenjtev;

public class Orange implements Fruit{
    int weight;

    public Orange(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
