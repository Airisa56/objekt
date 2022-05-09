package ru.skypro;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("Александр", "Пушкин" ) ;
        Author author1 = new Author( "Лев", "Толстой");
        Book book = new Book( 1970, "Война и мир", author1);
        Book  book1 = new Book(1960,"Онегин", author);
        book.setYear(2000);
        System.out.println(author.equals(author) ) ;
        System.out.println( author1.equals(author));
        System.out.println( book.toString());

        
    }

}
