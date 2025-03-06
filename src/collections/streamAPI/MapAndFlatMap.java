package collections.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MapAndFlatMap {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book("Being and Time","Heidegger",560,Type.PHILOSOPHY));
        books.add(new Book("The Trial","Franz Kafka",240,Type.NOVEL));
        books.add(new Book("Death on the Nile","Agatha Christie",370,Type.THRILLER));
        books.add(new Book("Ancient Greece","Robert F",435,Type.HISTORY));
        books.add(new Book("Ancient Rom","Robert F", 860,Type.HISTORY));
        books.add(new Book("Death of Virgil","Hermann Broch",590,Type.NOVEL));
        books.add(new Book("The Stranger","Albert Camus",500,Type.NOVEL));


        //map() and flatmap() are similar to selecting a column in sql
        List<String> words= Arrays.asList("Adam","Ana","Daniel");

        String[] array={"hello","shell"};
        List<String>unique=Arrays.asList(array).stream()
                .map(w->w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        unique.forEach(System.out::println);

    }
}
