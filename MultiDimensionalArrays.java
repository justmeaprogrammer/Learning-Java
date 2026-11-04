package com.javaInLessTime;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Jagged array - variable length of multiple rows or columns
        //a b c
        //a b
        //a b d
        System.out.println("------Jagged Array------");
        char[][] jaggedArr = new char[3][];

        jaggedArr[0]= new char[2];
        jaggedArr[1]= new char[3];
        jaggedArr[2]= new char[2];

        jaggedArr[0][0] = 'a';
        jaggedArr[0][1] = 'b';
        jaggedArr[1][0] = 'a';
        jaggedArr[1][1] = 'b';
        jaggedArr[1][2] = 'c';
        jaggedArr[2][0] = 'a';
        jaggedArr[2][1] = 'b';

        for(int i=0;i<jaggedArr.length;i++){
            for (int j=0;j<jaggedArr[i].length;j++){
                System.out.print(jaggedArr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
