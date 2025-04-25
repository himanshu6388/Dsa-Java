package Day05PatternPrint;

public class trangle {
    public static void main(String args[]){

        // Trangle Pattern
        // for(int line=1;line<=4;line++){
        //     for(int j=1;j<=line;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }



        // Inverted trangle star pattern
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=(4-i)+1;j++){
        //         System.out.print("  * ");
        //     }
        //     System.out.println();
        // }

        // Print half pyramid pattern
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // Print Character pattern
        int n= 4;
        char ch= 'A';
        for(int i=1;i<=n;i++){
            for(int chars=1;chars<=i;chars++){
                System.out.print(" " +ch);
                ch++;
            }
            System.out.println();
        }
     
       
    }
    
}
