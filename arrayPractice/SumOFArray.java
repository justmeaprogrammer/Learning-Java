package com.javaInLessTime.arrayPractice;

import java.sql.SQLOutput;

public class SumOFArray {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i:arr){
            sum = sum + i;
        }
        System.out.println("Sum of the Given Array is "+sum);
    }
}
