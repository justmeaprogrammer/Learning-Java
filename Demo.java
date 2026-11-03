package com.javaInLessTime;

public class Demo {
    public static void main(String[] args){
        //Integral Values
            //byte
            //byte age=23;
            System.out.println(Byte.MIN_VALUE);
            System.out.println(Byte.MAX_VALUE);


            //short
            //short age=130;
            System.out.println(Short.MIN_VALUE);
            System.out.println(Short.MAX_VALUE);

            //int
            //int age=2147483647;
            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);

            //long int
            long age =2147483648l;
            System.out.println(Long.MIN_VALUE);
            System.out.println(Long.MAX_VALUE);


            //float and double
            //float --> less precision
            //double --> more precision

            float anynum = 1.7f;

            float floatmin = Float.MIN_VALUE;
            float floatmax = Float.MAX_VALUE;

            System.out.println("Float Minimum Value :"+floatmin);
            System.out.println("Float Maximum Value :"+floatmax);

            double doublemin = Double.MIN_VALUE;
            double doublemax = Double.MAX_VALUE;

            System.out.println("Double Minimum value :"+ doublemin);
            System.out.println("Double Maximum value :"+ doublemax);


            char initial = 'a';
            System.out.println((int) initial);
            System.out.println((char) 10084);

            char heartSymbol =  10084;
            char hindiCharector = 2309;
            System.out.println(heartSymbol);
            System.out.println(hindiCharector);

            char symbol = '\u2742';
            System.out.println(symbol);


            for(int i = 0; i<128 ; i++){
                    System.out.println((char) i);
            }

    }
}
