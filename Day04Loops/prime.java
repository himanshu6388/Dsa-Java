package Day04Loops;

import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if(n==2){
            System.out.println("N is Prime.");
        }else{
            boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){    //n is a multiple of i (i not equal ot 1 or n)
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("N is Prime.");
        }else{
            System.out.println("N is not Prime.");
        }
        }
        
    }
}
