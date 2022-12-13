package Core_Java.Operators;

import java.util.Scanner;

public class For_loop_Number_Printing {
    public static void main(String[] args) {

        Scanner std = new Scanner(System.in);
        System.out.println("How many numbers you want to print");
        int User0 =std.nextInt();
       // String User = std.nextLine();  // this for String worlds printing as per spliting
     //   String wrods[] = User.split(" ");


        for(int i=0; i<=User0; i++){
            System.out.println(i);


     //   for (int i = 0; i <wrods.length; i++) {
           // System.out.println(wrods[i]);

        }
    }
}