package Collections.Map;

import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TreeMap;

public class Tree_map {

    public static void main(String[] args) {

        Map<Integer,String> treemap =new TreeMap<>();
        treemap.put(101, "Telangana");
        treemap.put(102, "Andraparadhesh");
        treemap.put(103, "Goa");
        treemap.put(104, "Madyapradhesh");
        treemap.put(105, "Gujarath");

        for(Map.Entry<Integer, String> calltreemap: treemap.entrySet()){

            if(calltreemap.getKey()>101 && calltreemap.getKey()<104){
                System.out.println(calltreemap.getKey() + " " + calltreemap.getValue());

        }
        }


    }
}
