package Strings;

public class Concat {
    public static void main(String[] args) {
        String FirstName = "Vishal";
        String LastName = "Thakur";
        String FullName = FirstName +" "+LastName;
        System.out.println(FullName);
        System.out.println(FullName.length());

        //chatAt
        for(int i=0;i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }
    }
}
