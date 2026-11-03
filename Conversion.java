package com.javaInLessTime;

public class Conversion {
    public static void main(String[] args){

        //Widening Conversion
        // Shorter format to bigger format
//        byte a = 10;                // 1 byte
//        short shortNum = a;         // 2 bytes
//        int intNum = shortNum;      // 4 bytes
//        long longNum = intNum;      // 8 bytes
//        float floatNum = longNum;   // 4 bytes
//        double doubleNum = floatNum;// 8 bytes

//        System.out.println(a);
//        System.out.println(shortNum);
//        System.out.println(intNum);
//        System.out.println(longNum);
//        System.out.println(floatNum);
//        System.out.println(doubleNum);


        // Narrowing conversion
        // Longer or bigger format to smaller

        long longNum = 1234567890123456789l;
        int intNum = (int) longNum;
        short shortNum = (short) intNum;
        byte byteNum = (byte) shortNum;


        System.out.println("Binary of :"+longNum+" is -> "+Long.toBinaryString(longNum));
        System.out.println("Binary of :"+intNum+" is -> "+Integer.toBinaryString(intNum));
        System.out.println("Binary of :"+intNum+" is -> "+Integer.toBinaryString(intNum));


        System.out.println(shortNum);
        System.out.println(byteNum);









    }

}
