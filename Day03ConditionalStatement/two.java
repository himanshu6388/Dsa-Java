package Day03ConditionalStatement;

import java.util.Scanner;

public class two {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        //  int a = 1;
        //  int b = 5;
        //  if(a>b){
        //     System.out.println("a is largest of 2");
        //  }else{
        //     System.out.println("b is largest of 2");
        //  }


        // Print Number is Odd or Even
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
