package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) throws IOException {
    System.out.println("Enter the input value");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    Predicate<Integer> checkOdd = i -> i%2 !=0;
    boolean oddResult = checkOdd.test(input);
        System.out.println("Given Number is odd :"+ oddResult);

    Predicate<Integer> checkPrime = i -> i == 1 || i == 2 || i == 3 || ((i % 2 == 0 || i % 3 == 0) ? false : true);
    boolean primeResult = checkPrime.test(input);
        System.out.println("Given Number is Prime :"+ primeResult);

    Predicate<Integer> checkPalindrome = i -> {
        int num = i;
        int reversed = 0;
        while (num !=0) {
            int digit = num %10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return i == reversed ? true : false;
    };
    boolean palindromeResult = checkPalindrome.test(input);
        System.out.println("Given Number is Palindrome :"+ palindromeResult);
}
}
