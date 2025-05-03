package day09Array;

public class binarySearch {
    // Binary search
    public static int search(int numbers[], int key){
        int start = 0 , end = numbers.length-1;
        while (start<=end) {
            int mid = (start+end) / 2;
            // Comparisons
            if(numbers[mid]==key){  //found
                return mid;
            }
            if(numbers[mid]<key){ //right
                start =  mid+1;
            }else{  //left
                end = end-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {4,3,5,9,8,1,3};
        int key = 3;
        System.out.println("index  for key is :" +search(numbers,key));
    }
}
