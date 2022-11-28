package Core_Java.Operators;

import java.util.Scanner;

public class NamePrint {

    public static void main(String[] args) {

        Scanner ravi = new Scanner(System.in);
        System.out.println("Enter you are name: ");
        String A = ravi.nextLine();
        System.out.println("How many times print you are name ? ");
        int B = ravi.nextInt();

        for(int i=1; i<=B; i++){
            System.out.println(i+"."+A);

        }

       /* int i=1;
        while(i<=B){
            System.out.println(A);   // Senario one to print values
            i++;
        }*/

       }

}

