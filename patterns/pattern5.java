package com.javaInLessTime.patterns;

public class pattern5 {
    public static void main(String[] args) {
        /*
        1 2 3 4
        1 2 3
        1 2
        1
        */

        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // 2 nd method
        System.out.println("Second Way");
        for (int i = 4; i > 0; i--) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= i; j++){
                line.append(j).append(" ");
            }
            System.out.println(line);
        }


    }
}
