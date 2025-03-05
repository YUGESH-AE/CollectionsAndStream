package collections.sortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceExample {
    public static void main(String[] args) {

        List<Book>books=new ArrayList<>();
        books.add(new Book("Norman levis","Word Power",200));
        books.add(new Book("Steve","Golden Rules",700));
        books.add(new Book("James","Java",900));
        books.add(new Book("Michio","Quantum",34));

        Collections.sort(books);
        System.out.println(books );
    }
}


class Book implements Comparable<Book>{

    private String authorName;
    private String title;
    private int noOfPages;

    public Book(){

    }

    public Book(String authorName, String title, int noOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.noOfPages = noOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", noOfPages=" + noOfPages +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.authorName.compareTo(o.authorName);
    }
}