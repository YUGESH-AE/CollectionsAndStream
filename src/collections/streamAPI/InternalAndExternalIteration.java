package collections.streamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InternalAndExternalIteration {

    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book("Being and Time","Heidegger",560,Type.PHILOSOPHY));
        books.add(new Book("The Trial","Franz Kafka",240,Type.NOVEL));
        books.add(new Book("Death on the Nile","Agatha Christie",370,Type.THRILLER));
        books.add(new Book("Ancient Greece","Robert F",435,Type.HISTORY));
        books.add(new Book("Ancient Rom","Robert F", 860,Type.HISTORY));
        books.add(new Book("Death of Virgil","Hermann Broch",590,Type.NOVEL));
        books.add(new Book("The Stranger","Albert Camus",500,Type.NOVEL));

        List<String> title=new ArrayList<>();

        //external iteration
        Iterator<Book> iterator= books.iterator();
        while (iterator.hasNext()){
            title.add(iterator.next().getTitle());
        }

        //internal iteration
        List<String>title2=books.stream().map(Book::getTitle).toList();
        title2.forEach(System.out::println);
    }
}
