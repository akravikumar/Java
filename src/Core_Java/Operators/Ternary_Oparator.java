package Core_Java.Operators;

import java.util.Scanner;

public class Ternary_Oparator {
    public static void main(String[] args) {

        // (Condition) ? stmt -1: stmt -2;
        Scanner  ram = new Scanner(System.in);
        System.out.println("Eneter any two values");
        int H =ram.nextInt();
        int L =ram.nextInt();

        int i= H>L ? H:L;
        System.out.println(i);

    }
}
