package Collections.List;

import Java_Methods.Java_Methods;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex_1 {

    public static void main(String[] args) {

        List<Integer> User = new ArrayList<>();

        User.add(10);
        User.add(11);
        User.add(14);
        User.add(16);
        User.add(106);

        User.remove(0); //Updated
        User.add(0,100); // Replace the ArrayList values by using the add
     //   System.out.println(User);

      /*  for(int i =0; i<User.size(); i++){
            System.out.println(User.get(i)); // Printing by using the for loop
        }*/

        for(Integer j: User){       // Enhanced for loop
            System.out.println(j);
        }

    }
}
