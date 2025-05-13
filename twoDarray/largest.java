package twoDarray;

import java.util.Scanner;

public class largest {
    
    public static void matrixLargest(int matrix[][]){
        int  larg = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(larg < matrix[i][j]){
                    larg = matrix[i][j];
                }
            }  
        }
      System.out.println("Greatest element of matrix is: " + larg); 
    }

    public static void main(String args[]){
        
        int matrix[][] = new int[4][4];
        int n= matrix.length, m= matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        matrixLargest(matrix);
    }
}
