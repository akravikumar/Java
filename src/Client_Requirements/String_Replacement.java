package Client_Requirements;

import java.util.Scanner;

public class String_Replacement {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a paragraph...!");
        String Student  = user.nextLine();

        System.out.println("Replaced by @ for your para");
        System.out.println(Student.replace("e", "@"));
    }
}
