package Day04Loops;

import java.util.Scanner;

public class dowhile {
    public static void main(String args[]){
        // int counter = 1;
        // do{
        //     System.out.println("Hello Word");
        //     counter++;
        // }while(counter <= 10);


        // Break Statement
        // for(int i=1;  i<=5;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the Loop.");


        Scanner sc =  new Scanner(System.in);
         

        // do{
        //     System.out.println("Enter you number:");
        //     int n = sc.nextInt();

        //     if(n % 10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);



        // Continue
        for(int i = 1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }


        // Display all number enter by the user except multiples of 10
        
        do{
            System.out.println("Enter Number:");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was:" +n );
        }while(true);
    }
}
   