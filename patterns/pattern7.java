package com.javaInLessTime.patterns;

public class pattern7 {
    public static void main(String[] args) {
        /*
         *****
         ***
         *
         */

        int rows = 3;
        for (int i = rows; i > 0; i--){
            StringBuilder line = new StringBuilder();
            line.append(" ".repeat(rows-i));
            line.append("*".repeat(2*i-1));
            System.out.println(line);
        }
    }
}
