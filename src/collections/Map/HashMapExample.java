package collections.Map;

import java.util.HashMap;
import java.util.Map;

/*
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Adam");
        map.put(2,"Ram");
        map.put(3,"Kevin");
        map.put(4,"Daisy");

        //get value by key set
        for(Integer key: map.keySet()){
            System.out.println(map.get(key));
        }

        //get value by entry set
        for (Map.Entry<Integer,String>entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
