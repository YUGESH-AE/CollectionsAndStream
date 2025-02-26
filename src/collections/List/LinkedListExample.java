package collections.List;

import java.util.LinkedList;
import java.util.List;

/*https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

 */
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.addLast(10);
        list.removeLast();

        for(Integer i:list){
            System.out.println(i);
        }

    }
}
