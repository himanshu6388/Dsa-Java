package Day03ConditionalStatement;

import java.util.Scanner;

public class three {
    public static void main(String args[]){
        // int age = 14;
        // if(age>=18){
        //     System.out.println("Adult");
        // }else if(age>=13 && age<18){
        //     System.out.println("Teeenage");
        // }else{
        //     System.out.println("Child");
        // }



        // Income Tax Calculator
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Income for calculate tax:");
        int  income = sc.nextInt();
        int tax;
        if(income < 500000){
            tax = 0;
        }else if(income >= 500000 && income <1000000){
            tax = (int)(income * 0.2);
        }else{
            tax = (int)(income * 0.3);
        }
        System.out.println("Your tax is:" + tax);
    }
}
