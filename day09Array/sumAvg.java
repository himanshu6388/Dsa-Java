package day09Array;

public class sumAvg {
    
    public static int sAvg(int numbers[]){
        int  sum = 0;
    
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        int avg = sum/numbers.length;
        System.out.println("Average is: "+avg);
        return sum;
    }

    public static void main(String args[]){
        
        int numbers[]= {1,2,3,4,5};

        int sum = sAvg(numbers);
        System.out.println("Sum is: "+sum);
    }
}
