package Strings;

import day06functionMethod.fact;

public class subString {
    
    public static String substr(String str, int si, int ei){
        String subst = ""; 
        for(int i=si; i<ei;i++){
            subst +=  str.charAt(i);
        }
        return subst;
    }

    public static void main(String[] args) {
        String str = "helloworld";

       String subStr =  str.substring(0,5);
       System.out.println(subStr);
        //System.out.println(substr(str, 0, 5));
    }
}
