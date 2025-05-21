package Strings;

public class stringComp {
    

    public static void main(String[] args) {
        String s1 = "Himanshu";
        String s2 = "Himanshu";
        String s3 = new String("Himanshu");

        // if(s1 == s2){
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }
        // if(s1 == s3){
        //     System.out.println("String  are equal");
        // }else{
        //     System.out.println("String are not  equal");
        // }


        
        if(s1.equals(s3)){
            System.out.println("String are equal");
        }else{
              System.out.println("String are not  equal");
        }
    }
}
