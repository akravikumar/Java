package Core_Java.ControlStatements.Switch_Stmt;

import java.util.Scanner;

public class Checking_Vowel {
    public static void main(String[] args) {

        Scanner ravi = new Scanner(System.in);
        System.out.println("Enter any alphabet!");
        char r =ravi.next().charAt(0);

        switch (r){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i' :
                System.out.println("Vowel");
                break;
            case 'o' :
                System.out.println("Vowel");
                break;
            case 'u' :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }


    }


}
