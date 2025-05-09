package rivision;

import day11array.stocks;

public class searchKey {
    // Search for a given key using linear search

    public static void findIndex(int arr[], int key){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
               index =i;
            }
        }
        System.out.println(index);
    }
    public static void main(String args[]){
        int arr[]= {3,5,9,4,8,7,6,2};
        int key = 5;
        findIndex(arr, key);
    }
}
