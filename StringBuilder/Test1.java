package StringBuilder;

public class Test1 {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("Vishal");
     System.out.println(sb);

     //CharAt
     System.out.println(sb.charAt(0));

     //Set char
     sb.setCharAt(0, 'A');
     System.out.println(sb);
            
    }
}
