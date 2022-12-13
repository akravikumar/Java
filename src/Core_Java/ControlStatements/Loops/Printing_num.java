package Core_Java.ControlStatements.Loops;

import java.util.Scanner;

public class Printing_num {

    public static void main(String[] args) {
        Scanner ravi =new Scanner(System.in);
        System.out.println("Enter any number!");
        int ch =ravi.nextInt();
        int i=1;
        while (i<ch){

            System.out.println(i+". Bheemewsh");
            i++;
        }
    }
}
