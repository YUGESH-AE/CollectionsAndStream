package collections.sortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingLambda {

    public static void main(String[] args) {
        List<Person>personList=new ArrayList<>();
        personList.add(new Person("yugesh",24));
        personList.add(new Person("Ravi",45));
        personList.add(new Person("santhosh",21));
        personList.add(new Person("Sai",19));

        personList.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());
        System.out.println(personList);

    }
}

class Person{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
}
