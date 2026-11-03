package com.javaInLessTime;

public class BitWiseOperators {
    public static void main(String[] args){
        int var = 3;

        //System.out.println(Integer.toBinaryString(var));

        // & and operator
        int a = 4;
        int b = 5;
        System.out.println("4 & 5  == " + (a & b));
        // 5 = 101 , 4 = 100   ,  101 & 100 = 100 == 4

        // | or operator
        System.out.println("4 | 5  == " + (a | b));
        // 5 = 101 , 4 = 100   ,  101 | 100 = 101 == 5

        // xor ^ operator
        System.out.println("4 ^ 5  == " + (a ^ b));
        // 5 = 101 , 4 = 100
        // same --> 0
        // different --> 1
        // 101 ^ 100 = 001 == 1

        // not ~ operator
        System.out.println("not 4 == " + (~a));
        System.out.println("    4 in binary == " + (Integer.toBinaryString(a)));
        System.out.println("    not 4 in binary == " + (Integer.toBinaryString(~a)));

        //left shift <<
        System.out.println("left shift --> shifts bits to left ");
        System.out.println("4 == "+(Integer.toBinaryString(4)));
        System.out.println("left shift 4 by one digit or bit == "+(Integer.toBinaryString(4<<1)));




    }
}
