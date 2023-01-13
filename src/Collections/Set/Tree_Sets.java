package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Sets {

    public static void main(String[] args) {

        Set<String> treesets = new TreeSet<>(); // it prints the values in ascending order OR alphabetical order

        treesets.add("Hyderabad");
        treesets.add("Panjagutta");
        treesets.add("Gachibowli");
        treesets.add("Secundarbad");
        treesets.add("midespace");

        Set<Integer> Tresets_int = new TreeSet<>();

        Tresets_int.add(20);
        Tresets_int.add(10);
        Tresets_int.add(50);
        Tresets_int.add(40);
        Tresets_int.add(12);

//        for(Integer rajesh: Tresets_int){    // printing values using enhanced for loop
//            System.out.println(rajesh);
//        }
//
//
//        for(String ravi: treesets){
//            System.out.println(ravi);
//        }


        treesets.forEach(ramu-> System.out.println(ramu));  // Printing values using forEach loop (-> lambda expression)

        System.out.println();
        Tresets_int.forEach(rajesh->System.out.println(rajesh));
    }
}
