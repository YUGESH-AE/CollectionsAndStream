package collections.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class ShortCircuitLoopFusion {
    public static void main(String[] args) {

        List<Book> books=new ArrayList<>();
        books.add(new Book("Being and Time","Heidegger",560,Type.PHILOSOPHY));
        books.add(new Book("The Trial","Franz Kafka",240,Type.NOVEL));
        books.add(new Book("Death on the Nile","Agatha Christie",370,Type.THRILLER));
        books.add(new Book("Ancient Greece","Robert F",435,Type.HISTORY));
        books.add(new Book("Ancient Rom","Robert F", 860,Type.HISTORY));
        books.add(new Book("Death of Virgil","Hermann Broch",590,Type.NOVEL));
        books.add(new Book("The Stranger","Albert Camus",500,Type.NOVEL));

        //loop fusion
        List<String> longestBooks=books.stream()
                .filter(p->{
                    System.out.println("Filtering:"+p.getTitle());
                    return p.getPages()>500;
                })
                .map(b->{
                    System.out.println("Mapping:"+b.getTitle());
                    return b.getTitle();
                })
                .limit(2)
                .toList();
    }
}
