package Client_Requirements;

import java.util.Scanner;

public class Sting_Split {

    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        System.out.println("Write a paragraph");
        String  MC = User.nextLine();
        String words [] = MC.split( " ");

        for(int i = 0; i<words.length; i++){

            System.out.println(words[i]);
        }

     //   System.out.println(MC.split(" "));




    }
}
