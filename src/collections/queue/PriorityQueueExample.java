package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        Queue<Person>queue=new PriorityQueue<>();
        queue.add(new Person("kevin",10));
        queue.add(new Person("Adam",21));
        queue.add(new Person("yugesh",10));
        queue.add(new Person("Ravi",21));

        while (queue.peek()!=null){
            System.out.println(queue.poll());
        }

    }
}


class Person implements Comparable<Person>{

    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Priority based on the age
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.age);
    }
}