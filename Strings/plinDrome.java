package Strings;

import day11array.stocks;

public class plinDrome {

    public static boolean isPalindrome(String str){
        for(int  i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a plaindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String  args[]){

        String str = "himanshu";
        System.out.println(isPalindrome(str));

    }
    
}
