package com.javaInLessTime;

public class ArithmaticOperators {
    public static void main(String[] args){
        int monthlySalary = 1000;
        int deductions = 500;
        int finalSalary = monthlySalary-deductions;

        System.out.println("Final Salary :" + finalSalary);

        int yearlySalary = monthlySalary*12;
        System.out.println("Yearly Salary is : "+yearlySalary);

        int totalKids = 3;
        int moneyPerKid = monthlySalary/totalKids;
        System.out.println(moneyPerKid);

        int a =1 ;
        System.out.println(a + a++);


        double x = 1.5 , y = 2.5 , z = 3.5 ;
        double result = (x + y) * (z-y)/(x+z);
        System.out.println(result);





    }
}
