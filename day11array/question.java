package day11array;

public class question {

    public boolean containsDuplicate(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    

    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        boolean res =  containsDuplicate(nums);
    }
    
}
