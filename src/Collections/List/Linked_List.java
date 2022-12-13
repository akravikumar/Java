package Collections.List;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

    public static void main(String[] args) {

        List<String> user =new LinkedList<>();

        user.add("Ravi");
        user.add("Bheemesh");
        user.add("Mahesh");
        user.add("rajesh");
        user.add("Ranga");

        System.out.println(user.size()); //Lenth print

        System.out.println(user.get(1));
        System.out.println();

        user.remove(1); //Remove

        for(String N: user){   // Enhanced for loop
            System.out.println(N);
        }


    }
}
