package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hashset {

    public static void main(String[] args) {

        Set<Integer> linkedhashset = new LinkedHashSet<>();

        linkedhashset.add(20);
        linkedhashset.add(10);
        linkedhashset.add(40);
        linkedhashset.add(5);
        linkedhashset.add(30);

      //  System.out.println(linkedhashset); //it follow the insertion order (It printing the order wise)

      for(Integer Rx: linkedhashset){
          System.out.println(Rx);

        }
    }
}
