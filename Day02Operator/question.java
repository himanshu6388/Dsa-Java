package Day02Operator;

public class question {
    public static void main(String args[]){


        // Question 1  
        // int x = 2, y =5;
        // int exp1 = (x *y /x);
        // int exp2 = (x * (y/x));
        // System.out.println(exp1 + " , ");
        // System.out.println(exp2);



        //Question 2
        // int x = 200, y=50, z=100;
        // if(x> y && y> z){
        //     System.out.println("Hello");
        // }
        // if(z >y && z< x){
        //     System.out.println("Java");
        // }
        // if((y+200) < x && (y+150)<z){
        //     System.out.println("Hello Java");
        // }


        // Question 3
        int x, y , z;
        x = y = z =2;
        x += y;
        y -= z;
        z /= (x+y);
        System.out.println(z + " " + y + " "  + z);

    }
}
