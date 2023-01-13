package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class Testtreemap {
    public static void main(String[] args) {

        Map<Integer, String> refnames =new TreeMap<>();

        refnames.put(11,"apple");
        refnames.put(12,"orange");
        refnames.put(13,"watermeloon");
        refnames.put(14,"maskmeloon");
        refnames.put(15,"graps");

        refnames.put(14,"elon Mask"); // updated by key value
        refnames.remove(12);    // removing by key value
        refnames.putIfAbsent(12,"Tata"); // Inserting key and values

        for(Map.Entry<Integer,String> ravikumar1: refnames.entrySet()){
            if(ravikumar1.getKey()!=14){
                System.out.println(ravikumar1.getKey()+" "+ravikumar1.getValue());
            }
        }
    }
}
