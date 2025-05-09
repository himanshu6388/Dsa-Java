package rivision;

public class count {
    
    // find the number  of odd and even element  in array
    public static void countOdEve(int arr[]){
        int odCount = 0;
        int eveCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 ==0){
                eveCount++;
            }else{
                odCount++;
            }
        }
        System.out.println("Number of Odd Element:"+ odCount);
        System.out.print("Number of Even Element:"+ eveCount);

    }

    public static void main(String args[]){
        int arr[] = {2,4,1,6,7,5,9};
        countOdEve(arr);
    }
}
