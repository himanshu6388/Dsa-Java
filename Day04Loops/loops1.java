package Day04Loops;

import java.util.Scanner;

public class loops1 {
    public static void main(String args[]){
        // whiel loop
        // print  hello world 100 times
        // int counter = 1;
        // while (counter<=10) {
        //     System.out.println(counter+ ". Hello Word");
        //     counter++;
        // }

        // Print value from 1 to 10
        // int count  = 1;
        // while (count <=10) {
        //     System.out.println(count);
        //     count++;
        // }

        Scanner sc = new Scanner(System.in);
        // int count = 1;
        // System.out.println("Enter Number:");
        // int num  = sc.nextInt();
        // while (count<=num) {
        //     System.out.print(count);
        //     count++;
        // }



        // Print Sum of N Natural Number
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        int  i=1;
        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.println("Sum is: " +sum );
    }
}
