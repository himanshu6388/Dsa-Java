package day09Array;

public class findIndex {
    
    // find  index of give element;
    public static int indexOf(int  numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        int numbers[] = {10,20,30};
        int key = 20;
        System.out.println(key+ " Index is: " +indexOf(numbers, key));
    }
}
