package Day04Loops;

import java.util.Scanner;

public class question {
    public static void main(String args[]) {

        // How many time print Hello
        // for(int i=0;i<5;i++){
        // System.out.println("Hello");
        // i += 2;
        // }

        // Write a program that reads a set of integer and then print the sum of the
        // even and odd integers.

        // int oddSum = 0;
        // int evenSum = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Numbers:");
        // int n = sc.nextInt();

        // System.out.println("Enter " + n + " Number: ");
        // for (int i = 0; i < n; i++) {
        //     int num = sc.nextInt();
        //     if (num % 2 == 0) {
        //         evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }
        // }
        // System.out.println("EvenSum: " + evenSum);
        // System.out.println("OddSum: " + oddSum);



        // Write a program to calculate factorial of n numbers
        // 
        


        // Write a program to print the multiple table of a number entered by the user.
        System.out.println("Enter the table: ");
        int num = sc.nextInt();

        for(int i=1;i<=10;i++){
           num = num * i;
        }
        System.out.println(num);
    }
}
