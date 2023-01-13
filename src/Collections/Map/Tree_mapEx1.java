package Collections.Map;

import java.util.Map;
import java.util.TreeMap;


public class Tree_mapEx1 {

    public static void main(String[] args) {

        Map<Integer, String> refname = new TreeMap<>();

        refname.put(101,"Ravi");
        refname.put(102,"Sai");
        refname.put(103,"pavan");
        refname.put(104,"Tulasi");
        refname.put(105,"bhavana");
        refname.put(106,"rajesh");
        refname.put(107, "ranga");
        refname.put(108, "ramu");
        refname.put(109, "harish");
        refname.put(10,"Kishore");


        for(Map.Entry <Integer, String> helloravi: refname.entrySet() ){

            if(helloravi.getKey()>102 && helloravi.getKey()<108){

                System.out.println(helloravi.getKey()+" "+ helloravi.getValue());
            }
        }
    }
}
