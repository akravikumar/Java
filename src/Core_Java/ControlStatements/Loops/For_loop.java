package Core_Java.ControlStatements.Loops;

import java.util.*;

public class For_loop {

    public static void main(String[] args) {

        Scanner H = new Scanner(System.in);
        System.out.println("Enter which table you want ?");

        int a = H.nextInt();
        System.out.println("You entered "+a+" table");
        for(int i = 1; i<=10; i++){

            System.out.println(a + " x " +i+ " = " + (a*i));
        }
    }
}
