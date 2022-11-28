package Core_Java.ControlStatements.If;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {


        Scanner rav=new Scanner(System.in);
        System.out.println("Enter Password...");

        String hyd = rav.nextLine();

        String ramesh = "Bheem";

        if (ramesh.equals(hyd)){

            System.out.println("Welcome Bheem");
        }
        else {
            System.out.println("Entered wrong password..!");

        }
    }

}
