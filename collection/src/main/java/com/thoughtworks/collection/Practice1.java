package com.thoughtworks.collection;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        for(int number: randomNumber()){
            System.out.println(number);
        }
    }

    /**
     * 生成10个0到20的随机整数，要求不能重复
     */
    public static Set<Integer> randomNumber() {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 10) {
            int number = new Random().nextInt(21);
            numberSet.add(number);
        }
        return numberSet;
    }
}
