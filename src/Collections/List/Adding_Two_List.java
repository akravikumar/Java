package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Adding_Two_List {

    public static void main(String[] args) {

        List<Integer> Us = new ArrayList<>();
        Us.add(5);
        Us.add(4);
        Us.add(3);
        Us.add(2);

        List<Integer> Rs =new ArrayList<>();
        Rs.add(20);
        Rs.add(10);
        Rs.add(9);
        Rs.add(5);

        System.out.println("Before merging");
        System.out.println(Us);
        System.out.println();

        Us.addAll(Rs);

        System.out.println("Those valies from Rs object ");
        System.out.println(Rs);

        System.out.println();

        for(int i =0; i<Us.size(); i++){
            System.out.println(Us.get(i));

        }

    }
}
