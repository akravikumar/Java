package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {
    public static void main(String[] args) {

        Map<String, String> hasmap =new HashMap<>();

        hasmap.put("Id","101");
        hasmap.put("name","ravi");
        hasmap.put("phone","818509");
        hasmap.put("village","Bainapally");
        hasmap.put("Degree", "Bcome compu");


        for(Map.Entry<String,String> rajesh: hasmap.entrySet()){         // Map having saperate for loop prntig values
            System.out.println(rajesh.getKey()+" "+rajesh.getValue());
        }
    }
}
