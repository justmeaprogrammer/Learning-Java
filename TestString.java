package com.javaInLessTime;

import java.sql.SQLOutput;

public class TestString {
    public static void main(String[] args){
        // strings are not primitive data Types
        // Sttrings are classes in java

        String a = "Om";
        String b = "Om";
        // String a stores the memory location where Om is stored and when
        // first time "Om" was declared , Java stored it in the String POOl so  second time t directely points to same memory location

        String om = new String("Om");
        String om1 = new String("Om");
        System.out.println(om==om1);// compares the refernce , not actual data
        System.out.println(a==b);

        // Correct methods
        System.out.println(om.equals(om1));//true

        //if we want to ignore the upper or lower case

        String om3 = new String("OM");
        System.out.println(om.equals(om3));//false
        System.out.println(om.equalsIgnoreCase(om3));//true

        // charAt and length
        int len = om.length();
        System.out.println(len);
        System.out.println(om.charAt(1));



    }

}
