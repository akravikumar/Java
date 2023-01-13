package Collections.List;

import java.util.List;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        List<String> vect =new Vector<>();
        vect.add("Rajesh");
        vect.add("ravi");
        vect.add("vizag");
        vect.add("Rajesh");
        vect.add("ravi");

     //   System.out.println(vect);  // It allows the duplicate values

        for(int i = 0; i<vect.size(); i++) {

            System.out.println(vect.get(i));
        }
      /*  for(String xyz: vect){
            System.out.println(xyz);

        }*/

    }

}
