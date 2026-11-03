package com.javaInLessTime;

public class ConditionalStatements {
    public static void main(String[] args) {

        int day = 1;

//        if(day==1){
//            System.out.println("Its Monday");
//        } else if (day==2) {
//            System.out.println("Its Tuesday");
//        } else if (day==3) {
//            System.out.println("Its Wednesday");
//        } else if (day==4) {
//            System.out.println("Its Thursday");
//        } else if (day==5) {
//            System.out.println("Its Friday");
//        } else if (day==6) {
//            System.out.println("Its Saturday");
//        } else if (day==7) {
//            System.out.println("Its Sundayyyyyyyyy");
//        }
//        else{
//            System.out.println("LOL! , not your day");
//        }


        switch (day) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sundayyyyyy");
                break;
            default: {
                System.out.println("Not Your Day, hahahahaha");
            }
        }
    }
}
