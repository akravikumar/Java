package Client_Requirements;

import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        System.out.println("Enter any number !");

        int rk=User.nextInt();
        int i;
        for(i=rk;i>=1;i--){
            System.out.println(i);
        }
    }
}
