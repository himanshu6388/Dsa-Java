package sorting;

import day09Array.largest;
import day11array.stocks;
import rivision.count;

public class counting {

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest =Math.max(largest, arr[i]);
        }

        int  count[] = new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    } 
    
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,2,6,7,3,5};
        countingSort(arr);
        printArr(arr);
    }
    
}
