package day09Array;

public class oddEven {
    // Count odd and Even element in array

    public static int countEevenOdd(int numbers[]){
        int oddCount = 0;
            int evenCount = 0;
        for(int i=0;i<numbers.length;i++){
            
            if(numbers[i] % 2== 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Odd No of Element is: "+oddCount);
        return evenCount;
    }

    public static void main(String args[]){
        int numbers[] = {1,4,7,5,7,3,10};
        
        System.out.println("Even No of Element is: "+countEevenOdd(numbers));
    }
}
