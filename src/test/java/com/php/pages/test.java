package com.php.pages;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        int number = 134567;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10; // this will create remainder of a number
            reversedNumber = reversedNumber * 10 + remainder; // reversed number is stored
            number /= 10; // this will upda
        }

        System.out.println(reversedNumber);
    }

}
