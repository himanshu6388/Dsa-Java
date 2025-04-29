package Day06function;

public class question {
    // Calculate average of  three number
    // public static int avg(int a, int b, int c){
    //     int avg = (a+b+c)/3;
    //     return avg;
    // }


    // find number is even or odd
    // public static boolean isEven(int n){
    //     if(n % 2 == 0){
    //         return true;
    //     }
    //     return false;
    // }



    // computer sum of the  digit in integer
    public static int sumOfDigit(int n){
        int copy = n;
        int sum = 0;
        while (n>0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n/ 10;
        }
        return sum;
    }
    public static void main(String args[]){
        // System.out.println(avg(3, 4, 7));

        // System.out.println( "Even:" +isEven(44));

        int sum = sumOfDigit(5959);
        System.out.println("Sum is:" + sum);
    }
}
