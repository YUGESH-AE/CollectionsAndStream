package wildsCards.lowerBound;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCards {

    public static void main(String[] args) {

        List<? super Integer> l1=new ArrayList<Integer>();

        List<? super Number> nums=new ArrayList<>();
        nums.add(10);
        nums.add(2.0);
        nums.add(1999.0);
        showAll(nums);
    }

    public static void showAll(List<? super Number>list){
        for(Object i:list){
            System.out.println(i);
        }
    }

    // your generic copy algorithm method here
    /*
    Wildcards exercise
In the previous lectures we have discussed wildcards - both upper bounded and lower bounded wildcards. In this exercise, your task is to implement copy method (it is present in Collections by the way) that's able to copy the items from a source list into a destination list. Use wildcards with the appropriate bounds!

Hint: you have to copy the items from one of the lists into another list (so there are read and write operations accordingly).
     */
    public<T> void copy(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }



}
