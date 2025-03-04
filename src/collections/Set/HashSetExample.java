package collections.Set;

import java.util.HashSet;
import java.util.Set;

/*
https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 =new HashSet<>();
        set1.add("java");
        set1.add(null);
        set1.add("java");

        //initial capacity =16
        //hashcode function(hash-function) transform the input into an array index

        Set<String>set2=new HashSet<>();
        set2.add("java");
        set2.add("spring");
        set2.add("react");
        set2.add(null);

        set1.retainAll(set2);
        for (String s: set1){
            System.out.println(s);
        }
    }
}
