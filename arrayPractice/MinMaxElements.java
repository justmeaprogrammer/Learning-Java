package com.javaInLessTime.arrayPractice;

public class MinMaxElements {
    public static void main(String[] args) {
        //find max element in an array

        int arr[] = {-111, 3, 44, 55, 6};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i >= largest) {
                largest = i;
            }
            if (i <= smallest) {
                smallest = i;
            }
        }
        System.out.println("Largest Element in array is " + largest);
        System.out.println("Smallest Element in the array is " + smallest);
    }
}
