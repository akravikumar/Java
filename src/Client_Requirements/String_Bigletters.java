package Client_Requirements;

import java.util.Scanner;

public class String_Bigletters {

    public static void main(String[] args) {
        Scanner User =new Scanner(System.in);
        System.out.println("Enter a name All in Capital ");
        String User2 =User.nextLine();
        String RX =User2.substring(0,User2.length()-1)+Character.toLowerCase(User2.charAt(User2.length()-1));

       System.out.println("your name is ");
        System.out.println("         "+RX);



    }
}
