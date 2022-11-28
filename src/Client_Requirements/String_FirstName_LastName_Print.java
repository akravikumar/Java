package Client_Requirements;

import java.util.Scanner;

public class String_Handling_1 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String Ch =user.nextLine();
        System.out.println("Enter Second Name: ");
        String RK =user.nextLine();

        String X = Ch+" "+RK;
        System.out.println("Hi " +X);

       // System.out.println("Hi " +Ch.concat(RK));

    }
}
