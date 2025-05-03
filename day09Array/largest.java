package day09Array;
import java.util.*;;
public class largest {
    // find larget number in java

    public static int greatest(int numbers[]){
        int largest = Integer.MIN_VALUE;  //-infinity
        int smallest =Integer.MAX_VALUE; //+infinithy

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is: " +smallest);
        return largest;
    }

    public static void main(String args[]){

        int numbers[]= {2,4,5,8,9};
        System.out.println("Largest Value is: " +greatest(numbers));

    }
}
