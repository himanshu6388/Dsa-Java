package rivision;

import day11array.stocks;

public class revArr {
    // reverse an array without using extra space

    public static void rev(int arr[]){
       int start = 0;
       int end = arr.length-1;
       while (start<end) {
            // swap
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
       }

    //    print the reserved  array
    for(int num:arr){
        System.out.print(num+ " ");
    }
    System.out.println();
    }


    public static void main(String args[]){
        int arr[] = {3,5,6,7,4,2,1};
        rev(arr);
    }
}
