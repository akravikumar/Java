package Client_Requirements;
import java.util.Scanner;

public class Even_Odd_Using_If {

    public static void main(String[] args) {

        Scanner User = new Scanner(System.in);

        int N = User.nextInt();

        if (N%2==0){
            if(N<5){
                System.out.println("Not Weird");
            }

            if(N<20){
                System.out.println("Weired");
            }

            if(N>20){
                System.out.println("Not Weird");

            }
        }else{
            System.out.println("Weird");

        }

    }
}
