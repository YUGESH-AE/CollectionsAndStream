package collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        Set<String>set=new LinkedHashSet<>();
        set.add("Java");
        set.add("CSS");
        set.add("Python");
        set.add("Angular");
        set.add("React");
        set.add("Spring");
        for (String s:set){
            System.out.println(s);
        }

    }
}
