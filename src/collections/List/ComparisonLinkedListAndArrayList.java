package collections.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ComparisonLinkedListAndArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();
        long arryTime =System.currentTimeMillis();
        for(int i=0;i<500000;++i){
            arrayList.add(i);
        }

        System.out.println("Time taken for ArrayList::"+(System.currentTimeMillis()- arryTime));

        LinkedList<Integer>linkedList=new LinkedList<>();
        long LinkedTime =System.currentTimeMillis();
        arryTime =System.currentTimeMillis();
        for(int i=0;i<500000;++i){
            linkedList.addFirst(i);
        }

        System.out.println("Time taken for LinkedList::"+(System.currentTimeMillis()- LinkedTime));
    }
}
