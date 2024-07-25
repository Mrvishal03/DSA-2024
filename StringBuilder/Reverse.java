package StringBuilder;

import Loops.forLoop;

public class Reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;// 5-0-1=4
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(back, frontChar);
            sb.setCharAt(front, backChar);

        }
        System.out.println(sb);
    }
}
