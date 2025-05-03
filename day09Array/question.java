package day09Array;
import java.util.*;
public interface question {
    

    // Find the largest and smalleset  number in array
    public static int maxMin(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest <numbers[i]){
                largest = numbers[i];
            }
            if(smallest >numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest is: "+smallest);
        return largest;
    }
    public static void main(String args[]){
        
        int numbers[]= {4,2,7,1,9};

        int largest = maxMin(numbers);
        System.out.println("Largest is: "+largest);
        
    }
}
