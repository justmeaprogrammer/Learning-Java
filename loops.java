package com.javaInLessTime;

public class loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("While Loop running " + (i + 1));
            i = i + 1;
        }

        for (int j = 1; j <= 10; j++) {
            System.out.printf("FOR loop Running %d \n",j);
        }
    }
}
