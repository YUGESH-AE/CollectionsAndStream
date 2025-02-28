package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/*
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
 */
public class ArrayDequeueExample {
    public static void main(String[] args) {

        Deque<Integer> queue=new ArrayDeque<>();

        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);
        queue.offer(10000);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }



    }
}
