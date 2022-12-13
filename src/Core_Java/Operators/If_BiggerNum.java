package Core_Java.Operators;

import java.util.Scanner;

public class If_BiggerNum {
    public static void main(String[] args) {

        Scanner billa = new Scanner(System.in);
        System.out.println("Eneter Prabhas number");
        int Prabhash = billa.nextInt();
        System.out.println("Eneter Sweety number");
        int Sweety = billa.nextInt();

        if(Prabhash >Sweety){
            System.out.println(" Prabhash bigger number is " +Prabhash);
        }
        if(Sweety>Prabhash){
            System.out.println("Sweety bigger number is "+Sweety);
        }
    }
}
