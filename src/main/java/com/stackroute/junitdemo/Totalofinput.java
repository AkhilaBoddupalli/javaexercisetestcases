package com.stackroute.junitdemo;

import java.util.Scanner;

public class Totalofinput {
    public int calculateInputSum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }


        return sum;
    }
}


