package rivision;

public class minElement {
    
    // find the minimum element in array
    public static void minElem(int arr[]){
        int mElem = Integer.MAX_VALUE;
        for(int  i=0;i<arr.length;i++){
            if(mElem>arr[i]){
                mElem =arr[i];
            }
        }
        System.out.println("Minimum Element:"+ mElem);
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,7,1,9};
        minElem(arr);
    }
}
