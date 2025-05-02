package day06functionMethod;

import java.util.Scanner;

public class fact {

    public static  int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to calculate Factorail:");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial is:" +fact);
    }
    
}
