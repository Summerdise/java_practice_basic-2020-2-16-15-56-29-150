package com.thoughtworks.collection;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomNumber().toArray()));
    }

    /**
     * 生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Set<Integer> numberSet = new HashSet<>();
        Collection<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; ) {
            int number = new Random().nextInt(21);
            if (!numberSet.contains(number)) {
                numberSet.add(number);
                numberList.add(number);
                i++;
            }
        }
        return numberList;
    }
}
