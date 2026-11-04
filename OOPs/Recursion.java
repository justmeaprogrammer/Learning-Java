package com.javaInLessTime.OOPs;

public class Recursion {
    //Factorial
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Sum of n natural Numbers
    public static int sumOfN_NaturalNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfN_NaturalNums(n - 1);
    }

    public static int sum(int... a) {
        int result = 0;
        for (int i : a) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = factorial(n);
        System.out.printf("Factorial of %d is %d \n", n, res);

        System.out.printf("Sum of first %d natural numbers is %d \n", n, sumOfN_NaturalNums(n));

        System.out.printf("%d+%d=%d",2,3,sum(2,3));
    }
}
