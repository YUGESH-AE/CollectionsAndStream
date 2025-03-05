package collections.streamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsWithNumbers {

     public static void main(String[] args) {
        int[] num ={1,5,3,-2,9,12};
        int sum=0;

        //Normal
         for (int j : num) {
             sum+=j;

         }
         System.out.println(sum);
         //stream
         sum= Arrays.stream(num).sum();
         System.out.println(sum);

         IntStream.range(0,10).filter(x->x>5).forEach(System.out::print );
    }
}
