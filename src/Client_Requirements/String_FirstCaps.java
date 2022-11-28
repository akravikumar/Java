package Client_Requirements;

import java.util.Scanner;

public class String_FirstCaps {
    public static void main(String[] args) {


        Scanner user = new Scanner(System.in);
        System.out.println("Enter any name with lower case: ");

        String X =user.nextLine();
        String str=Character.toUpperCase(X.charAt(0))+X.substring(1,X.length());

        System.out.println("your name is ");
        System.out.println("       "+str);

        //System.out.println("your name is: " +X.toUpperCase());

    }
}
