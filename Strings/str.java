package Strings;

import java.util.*;

public class str {
    
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]){
        // char arr[] = {'a','b','c','d','e'};

        // String str = "abcd";
        // String str2 = new  String("xyz");


        //String are IMMUTABLE

        // Scanner sc = new Scanner(System.in);

        // String name;
        // // name = sc.next();
        // name = sc.nextLine();
        // System.out.println(name);


        // String fullname = "Himanshu Verma";
        // System.out.println(fullname.length());
        

        // Concatination

        
        String firstName = "Himanshu";
        String lastName = "Verma";
        String fullname = firstName + " " + lastName;
        

        printLetters(fullname);

    }
}
