package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>();  // Array list creation
        obj.add(10);
        obj.add(20);
        obj.add(5);
        obj.add(50);
        obj.add(35);
        obj.add(60);
        obj.add(100);

        obj.remove(0); //remove the array values by using index number

       obj.forEach(billa ->{
           if(billa >40){
               System.out.println(billa); // Printing above 40 values
           }
       });






    //    System.out.println(obj);
       // System.out.println(obj.get(2));
       // System.out.println(obj.get(2));// It is calling specific arrayList values by using get(index num)

       // obj.clear(); // It clearing the all arrayList values by using "clear"
        // method
      //  System.out.println(obj);

    }
}
