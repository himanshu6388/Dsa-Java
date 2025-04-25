package Day04Loops;

public class forLoop {
    public static void main(String args[]){

        // for(int i=0;i<=4;i++){
        //     System.out.println("Hello World");
        // }


        // Print Square Pattern
        for(int i=1;i<=4;i++){
            System.out.println(" * * * * ");
        }


        // Print  Reverse of a number
        int n = 28483;
        
        while (n>0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }
        System.out.println();
        

        // Reverse the given number
        int x = 943438;
        int rev = 0;
        while (x>0) {
            int lstdigit = x %10;
            rev = (rev *10) + lstdigit;
            x = x/10;
        }
        System.out.print(rev);
    }
}
