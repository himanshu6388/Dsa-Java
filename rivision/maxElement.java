package rivision;

public class maxElement {

    // Find the maximum element in array
    public static void maxElem(int arr[]){
        int mElem = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(mElem<arr[i]){
                mElem = arr[i];
            }
        }
        System.out.println(mElem);
    }
    public static void main(String args[]){
        int arr[] = {4,2,3,9,5,7};
        maxElem(arr);
    }
}
