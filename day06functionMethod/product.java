package day06functionMethod;

public class product {

    public static int  multiply(int a, int  b){
        int  product = a*b;
        return product;
    }
    public static void main(String args[]){
        int prod = multiply(3, 5);
        System.out.println("Product is: " +prod);
    }
}
