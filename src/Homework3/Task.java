package Homework3;
import java.util.*;

public class Task {
    public static void main( String[] args ) {
        Author author1 = new Author(101, "L.Tolstoy");
        Author author2 = new Author(102, "A.Chekhov");
        Author author3 = new Author(103, "I.Ilf");
        Author author4 = new Author(104, "E.Petrov");

        Publisher publisher1 = new Publisher(201, "Azbuka", "Moskva, Shosse Revolutsii 154");
        Publisher publisher2 = new Publisher(202, "AST", "Moskva, Malaya Nikitskaya 32");
        Publisher publisher3 = new Publisher(203, "Piter", "Saint-Petersburg, Ligovsky prospekt 143");

        Book[] books = new Book[5];
        books[0] = new Book("0001", "Voina&Mir", Arrays.asList(author1), publisher1.PubName, "2013", true);
        books[1] = new Book("0002", "Anna Karenina", Arrays.asList(author1), publisher2.PubName, "2010", false);
        books[2] = new Book("0003", "Vishnevy Sad", Arrays.asList(author2), publisher3.PubName, "2000", true);
        books[3] = new Book("0004", "Dvenadtst Stuliev", Arrays.asList(author3,author4), publisher2.PubName, "1994", true);
        books[4] = new Book("0004", "Zolotoy Telenok", Arrays.asList(author4), publisher2.PubName, "1994", true);

        String separator = "================================================";

        books[0].getBookName();
        System.out.println(separator);

        books[0].getBookCover();
        System.out.println(separator);

        System.out.println(books[0]);
        System.out.println(separator);

        System.out.println(books[1]);
        System.out.println(separator);

        books[0].setBookName("New Naming");
        System.out.println(books[0]);

        System.out.println(separator);
        System.out.println(books[3]);

        System.out.println(separator);
        getBookByPublisher(books, publisher2);

        System.out.println(separator);
        getBookNamesForAuthor(books, "E.Petrov");
    }

    public static void getBookNamesForAuthor(Book[] books, String authorName) {
        for (Book book : books) {
            List<Author> authors = book.getAuthorforBook();
            for (Author author : authors) {
                if (author.getAuthorName().equals(authorName)) {
                    System.out.println("Book name: " + book.Name);
                }
            }
        }
    }

    public static void getBookByPublisher( Book[] books, Publisher publisher ) {
        for (Book book : books) {
            if (book.getPublisherforBook().equals(publisher.PubName)) {
                System.out.println("For publisher " + publisher.PubName + " there is a book: " + book.Name);
            }
        }
    }
}

