package rivision;

import day09Array.oddEven;

public class countOddEven {
    // Count the sum  of even and odd Element  in array
    public static void oddEven(int arr[]){
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 ==0){
                evenSum += arr[i];
            }else{
                oddSum += arr[i];
            }
        }
        System.out.println("Sum of Even Element:"+ evenSum);
        System.out.println("Sum of odd Element:"+ oddSum);
        
    }

    public static void main(String  args[]){
        int arr[] = {2,4,3,5,7,6,8,9};
        
        oddEven(arr);
    }
}
