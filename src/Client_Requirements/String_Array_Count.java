package Client_Requirements;

import java.util.Scanner;

public class String_Array_Count {
    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        System.out.println("Enter a paragraph..!");
        String Emp =User.nextLine();
        String Str [] = Emp.split(" ");

      //   System.out.println(Str.length+ " are present in paragraph"); Array lenth contains count the words


        int Count = 0;
        for(int i =0; i<Str.length; i++){
            Count ++;
        }
        System.out.println(Count + " are present in paragraph");
    }
}
