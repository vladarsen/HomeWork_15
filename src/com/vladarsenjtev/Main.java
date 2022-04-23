package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple(2);
        Apple appleTwo = new Apple(3);
        Apple appleThree = new Apple(1);

        Orange orange = new Orange(1);
        Orange orangeTwo = new Orange(3);
        Orange orangeThree = new Orange(2);

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        Box<Apple> boxAppleTwo = new Box<>();


        boxApple.add(apple);
        boxApple.add(appleTwo);
        boxApple.add(appleThree);
        boxOrange.add(orange);
        boxOrange.add(orangeTwo);
        boxOrange.add(orangeThree);
        boxAppleTwo.add(appleTwo);
        boxAppleTwo.add(appleThree);

        System.out.println(boxApple.getFruits());
        System.out.println(boxApple.getWeight());
        System.out.println();
        System.out.println(boxOrange.getFruits());
        System.out.println(boxOrange.getWeight());
        System.out.println();
        System.out.println(boxApple.compare(boxOrange));
        System.out.println();
        boxApple.merge(boxAppleTwo);
        System.out.println(boxApple.getFruits());
    }
}
