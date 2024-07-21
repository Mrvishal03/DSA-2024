package Exercise1;

//Write a function which takes in 2 numbers and returns the greater of those two.

public class Q3 {

    public static void findGreater(int a,int b){
        if (a>b) {
            System.out.println(a+" is grater");
        }
        else{
            System.out.println(b+" is greater");
        }
        return;

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        findGreater(a,b);

        
    }
}
