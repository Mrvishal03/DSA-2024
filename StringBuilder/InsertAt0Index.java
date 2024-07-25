package StringBuilder;

public class InsertAt0Index {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(2, "j");
        System.out.println(sb);

        //delete the extra j
   sb.delete(2, 3);
   System.out.println(sb);

   //Append

   StringBuilder tb = new StringBuilder("h");
   tb.append("i");
   System.out.println(tb);


    }
}
