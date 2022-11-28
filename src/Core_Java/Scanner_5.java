package Core_Java;


import java.util.Scanner;
public class Scanner_5 {

    public static void main(String[] args) {

        Scanner Y = new Scanner(System.in);
        System.out.println("Enter two values ");
        int ram = Y.nextInt();
        int raju = Y.nextInt();
        int b=ram+raju;
        int c=ram*raju;
        System.out.println("Addition is " + b );
        System.out.println("Mulitification is " + c);


    }
}
