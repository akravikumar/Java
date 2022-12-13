package Core_Java.ControlStatements.Switch_Stmt;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner rajesh = new Scanner(System.in);
        System.out.println("Enter any week day ");
        int user =rajesh.nextInt();

        switch (user){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter only 7 days !. recorrect it ");

        }
    }
}
