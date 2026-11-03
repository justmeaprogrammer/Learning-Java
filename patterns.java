package com.javaInLessTime;

public class patterns {
    public static void main(String[] args) {
        // Pattern 1

//        for (int i = 1; i < 6; i++) {
//            for (int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        String row = "";
        for (int i = 1; i < 6; i++) {
            row = row + "*";
            System.out.println(row);
        }

    }
}
