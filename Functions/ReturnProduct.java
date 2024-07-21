package Functions;

public class ReturnProduct {
    public static int multiply(int x,int y){
        int mul = x*y;
        return mul;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int mul = multiply(a, b);
        System.out.println("Multiplication of "+a+" and "+b+" is "+mul);

    }
}
