package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_hashmap {
    public static void main(String[] args) {

        Map<Integer, String> linkedhashmap =new LinkedHashMap<>();
        linkedhashmap.put(1,"ravi");
        linkedhashmap.put(2,"rajesh");
        linkedhashmap.put(3,"ramu");
        linkedhashmap.put(4,"ranga");
        linkedhashmap.put(5,"bheem");


        for (Map.Entry<Integer, String> refname: linkedhashmap.entrySet()){
            System.out.println(refname.getKey()+" "+refname.getValue());
        }
    }
}
