package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
 */
public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue=new LinkedList<>();
        queue.add("Adam");
        queue.add("Kevin");
        queue.add("Ana");

        //offer method return a boolean value
        queue.offer("Katy");
        queue.offer("william");

        //FIFO
        for(String s:queue){
            System.out.println(s);
        }

        //It will remove the 1st item in the queue
        System.out.println(queue.remove());


    }
}
