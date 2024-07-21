package Exercise1;

//Write a function that takes in the radius as input and returns the circumference of a circle.
public class Q4 {
    public static int findCircummferrence(int r){
          int circummference= (int) (2*3.14*r);
          return circummference;

    }
    public static void main(String[] args) {
        int radius = 5;
        int circummference = findCircummferrence(radius);
        System.out.println(circummference);

    }
}
