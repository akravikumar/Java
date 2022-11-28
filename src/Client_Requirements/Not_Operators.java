package Client_Requirements;

import java.util.Scanner;

public class Not_Operators {
    public static void main(String[] args) {
        Scanner Std = new Scanner(System.in);
        System.out.println("Enter 1st Numbers...");
        int User = Std.nextInt();
        System.out.println("Enter 2nd Number...");
        int User1 = Std.nextInt();

        if (User != User1) {

            System.out.println("your results are = " + (User1 + User));
        }else
            System.out.println("your results are = "+ (User*User1));
        }

    }


