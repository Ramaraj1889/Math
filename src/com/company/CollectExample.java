package com.company;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        Integer input[] = new Integer[] { 7,2,3,3,2,4,3,4,2,4,5,3,2,1,4,6,5,5,7 };
        List<Integer> li = Arrays.asList(input);


        Map<Integer, Long> hm = li.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        hm.forEach((K,V) -> System.out.println(K + " : " + V));
    }
}
