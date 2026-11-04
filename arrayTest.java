package com.javaInLessTime;

public class arrayTest {
    public static void main(String[] args){
        int[] arr = new int[5];
        int[] arr1 = {1,2,3,4,5};
        // all the data in array is stored in heap memory
        // but , the pointer or we can say reference in java for the first element is stored inside the stack memory

        for(int i: arr1){
            System.out.println(i);
        }
    }
}
