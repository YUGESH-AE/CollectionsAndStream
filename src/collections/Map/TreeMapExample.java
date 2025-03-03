package collections.Map;

import java.io.FilterOutputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html
 */
public class TreeMapExample {
     public static void main(String[] args) {

        TreeMap<Integer,String> map=new TreeMap<>(Comparator.reverseOrder());
        map.put(2,"java");
        map.put(5,"angular");
        map.put(1,"spring");
        map.put(3,"react");

        for (Map.Entry<Integer,String>m:map.entrySet()){
            System.out.println(m.getKey()+"-"+m.getValue());
        }
         System.out.println();
        //First and Last key methods are available in the Tree map class not in the map interface
         System.out.println(map.firstKey());
         System.out.println(map.lastKey());
    }
}
