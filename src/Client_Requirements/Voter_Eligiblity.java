package Core_Java.Client_Requirements;

import java.util.Scanner;

public class Voter_Eligiblity {
    public static void main(String[] args) {
        Scanner Gani = new Scanner(System.in);
        System.out.println("Enter age for Voter");
        int raj = Gani.nextInt();

        if(raj>18){
            System.out.println("your eligible for Voter");
        }else {
            System.out.println("your not eligible for Voter");
        }
    }
}
