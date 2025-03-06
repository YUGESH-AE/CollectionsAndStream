package collections.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithCustomObjects {
    public static void main(String[] args) {

        List<Book> books=new ArrayList<>();
        books.add(new Book("Being and Time","Heidegger",560,Type.PHILOSOPHY));
        books.add(new Book("The Trial","Franz Kafka",240,Type.NOVEL));
        books.add(new Book("Death on the Nile","Agatha Christie",370,Type.THRILLER));
        books.add(new Book("Ancient Greece","Robert F",435,Type.HISTORY));
        books.add(new Book("Ancient Rom","Robert F", 860,Type.HISTORY));
        books.add(new Book("Death of Virgil","Hermann Broch",590,Type.NOVEL));
        books.add(new Book("The Stranger","Albert Camus",500,Type.NOVEL));

        books.stream()
                .sorted(Comparator.comparing(Book::getAuthor).thenComparing(Book::getPages))
                .filter(book->book.getType().equals(Type.NOVEL))
                .forEach(System.out::println);

        System.out.println();
        List<String> title=books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .map(Book::getTitle)
                .toList();
        title.forEach(System.out::println);

        Map<Type,List<Book>> bookByType=books.stream()
                .collect(Collectors.groupingBy(Book::getType));
        bookByType.entrySet().stream().forEach(System.out::println);


    }
}



