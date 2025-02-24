package wildsCards.upperBound;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCards {

    //upper bound wild cards will be used for reading
    public static void showALl(List<? extends Number>list){
        for (Number n:list){
            System.out.println(n);
        }
    }

    public static void sumAll(List<? extends Number>list){
        double sum=0;
        for(Number i:list){
            sum+=i.doubleValue();
        }
        System.out.println("Sum of ::"+sum);
    }

    public static void main(String[] args) {

        //we can create ArrayList like this
        List<? extends Number>l1=new ArrayList<Integer>();
        List<? extends Number>l2=new ArrayList<Double>();
        List<? extends Number>l3=new ArrayList<Float>();

        List<Integer>integers= Arrays.asList(10,20,30,40);
        //upper bound wild cards will be used for reading
        showALl(integers);
        sumAll(integers);

    }
}
