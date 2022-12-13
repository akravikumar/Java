package Client_Requirements;

import java.util.Scanner;

public class Conistable_Elgibility {

    public static void main(String[] args) {

        Scanner ravi =new Scanner(System.in);
        System.out.println("Enter age for pollice job !");
        int l= ravi.nextInt();

        if(l>18 && l<30){

            System.out.println("your eligible");

        }else{
            System.out.println("your not eligible");
        }

       /* if(l<30){
            System.out.println("your eligible");

        }else{
            System.out.println("your not eligible");
        }*/

    }
}
