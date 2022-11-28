package Client_Requirements;

import java.util.Scanner;

public class Even_Odd_numbers {
    public static void main(String[] args) {


        Scanner User =new Scanner(System.in);

        System.out.println("Enter a number, then check you entered is even or add");

        int N = User.nextInt();

        if(N%2==0){
            System.out.println("you entered number is even " + N);

        }else{

        System.out.println("you entered number is Odd" +N);
    }

    }
}
