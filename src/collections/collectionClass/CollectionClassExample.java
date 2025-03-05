package collections.collectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassExample {
    public static void main(String[] args) {
        List<Integer>num=new ArrayList<>();
        num.add(78);
        num.add(2);
        num.add(8);
        num.add(19);
        num.add(3);

        //we can reverse the order
        Collections.sort(num);
        System.out.println(num);

        //finding min and max
        System.out.println(Collections.min(num));

        //shuffle the underlying collection
        Collections.shuffle(num);
        System.out.println(num);

        Collections.rotate(num,1);
        System.out.println(num);
    }
}
