package collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String,Integer>map=new LinkedHashMap<>();

        map.put("aaa",12);
        map.put("bbb",13);
        map.put("ccc",14);
        map.put("ddd",15);
        map.put("eee",16);
        map.put("fff",17);

        for(Map.Entry<String,Integer>m: map.entrySet()){
            System.out.println(m.getKey()+"-"+m.getValue());
        }
    }
}
