package Client_Requirements;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class String_Hi_repeated {
    public static void main(String[] args) {

        Scanner User =new Scanner(System.in);
        System.out.println("Enter a paragraph...!");
        String Student =User.nextLine();
        String Str[] = Student.split(" ");

        int counter =0;

        for(int i = 0; i<Str.length; i++){

            //System.out.println(Str[i]);
            if(Str[i].equalsIgnoreCase ("Hi")){
                counter ++;
            }

        }
        System.out.println("Hi repeated "+ counter + " times");

    }
}
