
package day09Array;
import java.util.*;

public class res {
    
    public static int Search(String[] menu, String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        String[] menu = {"samosa","chilli","momos"};
        String key = "chilli";


        int index = Search(menu, key);
        if(index != -1){
            System.out.println(key + "find at index :" +index);
        }else{
            System.out.println(key+ " Not is Reastaurent menu.");
        }
    }
}
