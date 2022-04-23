package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        String[] arrTwo = {"Hello", "world"};

        System.out.println(toList(arr));
        System.out.println(toList(arrTwo));
    }

    public static <T> List<T> toList(T[] arr) {
        List<T> arrayToList = new ArrayList<>();
        arrayToList.addAll(List.of(arr));
        return arrayToList;
    }
}
