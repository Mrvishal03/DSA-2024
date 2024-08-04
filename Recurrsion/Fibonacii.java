package Recurrsion;

public class Fibonacii {
    public static void PrintFibo(int a ,int b ,int n){
        if (n==0) {
            return;
            
        }
        int c= a+b;
        System.out.println(c);
        PrintFibo(b, c, n-1);

    }
    public static void main(String[] args) {
        int a =0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        PrintFibo(a,b,n-2);
    }
}
