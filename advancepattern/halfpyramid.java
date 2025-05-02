package advancepattern;

import java.util.Scanner;

import day06functionMethod.fact;

public class halfpyramid {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Line:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Stars *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}
