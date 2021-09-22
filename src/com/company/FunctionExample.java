package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    public static void main(String[] args) {
        FunctionExample obj = new FunctionExample();
        Function<String, Integer> fn = in -> in.length();
        Integer result = fn.apply("Ramaraj");
        System.out.println(result);

        List<String> li = Arrays.asList("abc", "def", "abc");
        Map<String, Integer> hm = obj.convertListToMap(li, x -> Collections.frequency(li, x));
        System.out.println(hm);
        hm.forEach((k,v) -> System.out.println(k + " : "+ v));

//        Map<String, Integer> hm = li.stream().map( x -> obj.convertListToMap1(li, Collections.frequency(li, x)));
    }

    public <T, U> Map<T, U> convertListToMap(List<T> list, Function<T, U> fn) {
        Map<T, U> hm = new HashMap<>();
        for(T t : list) {
            hm.put(t, fn.apply(t));
        }
        return hm;
    }

//    public <T, U> Map<T, U> convertListToMap1(List<String> list, Function<T, U> fn) {
//        Map<T, U> hm = new HashMap<>();
//        for(T t : list) {
//            hm.put(t, fn.apply(t));
//        }
//        return hm;
//    }
}
