package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Test {
    public static void main(String[] args) {

        List<Integer> refname = new ArrayList<>();

        refname.add(20);
        refname.add(30);
        refname.add(20);
        refname.add(70);


        refname.forEach(ravi->System.out.println(ravi));  // for each method using lambada


    }
}
