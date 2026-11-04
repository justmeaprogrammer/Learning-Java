package com.javaInLessTime.patterns;

public class pattern6 {
    public static void main(String[] args) {
        /*
         *
         ***
         *****

         */

        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            StringBuilder line = new StringBuilder();
            //spaces
            for (int j = rows - i; j > 0; j--) {
                line.append(" ");
            }


            //stars
            line.append("*".repeat(2 * i - 1));
            System.out.println(line);

        }


        //2nd Method
        System.out.println("Second Method");
        for (int i = 1; i <= rows;i++ ){
            StringBuilder line = new StringBuilder();
            line.append(" ".repeat(rows-i));
            line.append("*".repeat(2*i-1));
            System.out.println(line);
        }
    }
}
