package Homework3;

import java.util.*;
public class Book {
    String ISBN;
    String Name;
    List<Author> Authors;
    String Publisher;
    String PublicationDate;
    boolean Paperback;

    Book() {

    }

    Book( String ISBN, String Name, List<Author> Authors, String Publisher, String PublicationDate, boolean Paperback ) {
        this.ISBN = ISBN;
        this.Name = Name;
        this.Authors = Authors;
        this.Publisher = Publisher;
        this.PublicationDate = PublicationDate;
        this.Paperback = Paperback;
    }

    public void getBookName() {
        System.out.println("The name of the book is: " + Name);
    }

    public void setBookName( String Name ) {
        this.Name = Name;
        System.out.println("Updated name of the book with ISBN " + ISBN + " is: " + Name);
    }

    public String toString() {
        return ("Book info:\n" + "Name: " + Name + "\n" + "Author: " + Authors + "\n" + "Publisher: " + Publisher + "\n" + "Is paperback: " + Paperback);
    }

    public String getPublisherforBook() {
        return Publisher;
    }

    public List<Author> getAuthorforBook() {
        return Authors;
    }

    public void getBookCover() {
            if (Paperback) {
                System.out.println("This book is paperback");
            } else {
                System.out.println("This book is hardcover");
            }
        }
}

