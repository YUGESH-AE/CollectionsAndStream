package collections.Set;

import java.util.Set;
import java.util.TreeSet;

/*
https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
 */
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(15);
        set.add(9);
        set.add(2);
        set.add(10);
        set.add(2);
        set.add(3);

        for (Integer i:set){
            System.out.println(i);
        }


    }
}
