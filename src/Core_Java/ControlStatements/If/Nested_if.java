package Core_Java.ControlStatements.If;

import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {


        Scanner m=new Scanner(System.in);
        System.out.println("Ennter age for Police Job");
        int X = m.nextInt();

        if(X>18) {
            if(X<30){
                System.out.println("your eligible");
            }else {
                System.out.println("your not eligible");
            }

        }else {
            System.out.println("your not eligible");
        }

    }
}
