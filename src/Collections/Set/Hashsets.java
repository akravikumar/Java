package Collections.Set;


import java.util.HashSet;
import java.util.Set;

public class Hashsets {
    public static void main(String[] args) {

        Set<Integer> sets =new HashSet<>();  //Set won't allows the duplicate values
        sets.add(10);
        sets.add(10);
        sets.add(20);
        sets.add(30);
        sets.add(40);

      //   System.out.println(sets);
     //   System.out.println(sets.get(2));  We can’t access and remove the data based on index number

        sets.forEach(ravi ->System.out.println(ravi)); // printing the forEach loop
    }
}
