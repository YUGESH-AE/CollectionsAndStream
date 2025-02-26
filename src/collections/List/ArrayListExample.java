package collections.List;

import java.util.*;


/*
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 */
public class ArrayListExample {
    /*
    In this lecture, your exercise is to reverse a List<Integer> in-place (without extra memory) - by the way it is included in Java's Collections.

For example:

Input is [1, 2, 3, 4] --> result should be [4, 3, 2, 1] .

There are multiple solutions (with quadratic running time as well as with linear running time complexity).

Good luck!
     */
    public void reverse(List<Integer> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("yugesh");
        name.add("priya");
        name.add("oneplus");
        name.add("redmi");

        // random indexing in o(1)
        System.out.println(name.get(0));

        //insert a item in a specified index
        name.add(4,"xiomi");

        //remove a item\
        name.remove(0);

        //because of the iterator
        for(String i:name){
            System.out.println(i);
        }
        //contains method will check whether the item is present or not
        System.out.println(name.contains("priya"));

        //Array containing all  element

        Object[] o=name.toArray();

        for(Object i:o){
            System.out.println(i);
        }
    }
}
