package Day06function;

public class funcoverloading {


    
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }


    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
       return a+b;
    }
    public static void main(String args[]){
        
        // System.out.println(sum(3,5));
        // System.out.println(sum(5,2,1));


        System.out.println(sum(3,5));
        System.out.println(sum(3.2f, 4.5f));
    }
}
