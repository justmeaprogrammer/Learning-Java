package com.javaInLessTime.patterns;

public class pattern2 {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        */
//        String row = "";
//        for (int i = 1; i < 5; i++) {
//            row = row + i +" ";
//            System.out.println(row);
//
//        }
// Problem with this solution is every time java makes a new string so very bad for bigger operations

        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }

    }
}
