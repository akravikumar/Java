package Client_Requirements;

import java.util.Scanner;

public class String_Paragraph {
    public static void main(String[] args) {

        Scanner Std = new Scanner(System.in);
        System.out.println("Enter a paragraph..!");
        String User = Std.nextLine();

        System.out.println("Which workd do you want to caluculate..");
        String User2 =Std.nextLine();

        String string[] = User.split(" ");

        int h = 0;

        for (int i = 0; i < string.length; i++) {

        if ( string[i].equalsIgnoreCase(User)) {
            h++;
        }

        }

        System.out.println("you occured " +h++ + " times in paragraph");

    }


}
