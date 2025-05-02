package day06functionMethod;

import java.util.Scanner;

public class one {

    public static void swap(int a,int b){
        // swap
        int temp = a;
        a = b;
        b = temp;
        
    }

    public static void Greet(){
        System.out.println("Hello World");
    }
    // Calculate Sum of two nuber function
    public static void calculateSum(int a, int b){
        int sum  = a+b;
        System.out.println("Sum is:" +sum);
        
        // int sum = a + b;
        // System.out.println("Sum is:" + sum);
    }
    public static void main(String args[]){
        
        // Greet();  // function call
        // Greet();  //function call

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Value of a:");
        // int a = sc.nextInt();
        // System.out.println("Enter value of b:");
        // int b = sc.nextInt();
        // calculateSum(a, b);   //argumennts or actural parameters


        // CAll by value
        int a= 4;
        int b = 10;
        swap(a,b);
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        
    }
}
