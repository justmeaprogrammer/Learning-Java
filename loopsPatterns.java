package com.javaInLessTime;

public class loopsPatterns {
    public static void main(String[] args) {


        /*
        1
        10
        100
        1000
        10000

         */
        for (int i = 1; i <= 10000; i = i * 10) {
            System.out.println(i);
        }


        //print table of 7
        for (int j = 0; j <= 70; j = j + 7) {
            System.out.println(j);
        }

        // sum of n natural numbers
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("Sum of 1 to 10 is : " + sum);

        //count digits of a number

        int number = 456457;
        int counter = 0;
        while (number > 0) {
            number = number / 10;
            counter++;
        }
        System.out.printf("its a %d digit number \n", counter);

        // factorial
        int n = 5;
        int y = n;
        int total = 1;
        while (n>0){
            total = n * total;
            n--;
        }
        System.out.printf("Factorial of %d is %d \n",y,total);

    }
}