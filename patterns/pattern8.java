package com.javaInLessTime.patterns;

public class pattern8 {
    public static void main(String[] args){
        /*
           *
          ***
         *****
          ***
           *
        */

        int rows = 5;
        for(int i=1;i<=rows;i++){
            if(i<=rows/2){
                StringBuilder line = new StringBuilder();
                line.append(" ".repeat(rows-i-2));
                line.append("*".repeat(i*2 - 1));
                System.out.println(line);
            }
            else{
                StringBuilder line = new StringBuilder();
                line.append(" ".repeat(rows-i));
                System.out.println(line);

            }
        }
    }
}
