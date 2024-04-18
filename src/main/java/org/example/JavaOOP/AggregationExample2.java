package org.example.JavaOOP;

public class AggregationExample2 {
    public static void main(String[] args){
        Book book1= new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book3 = new Book("1984", "George Orwell");

        Library library = new Library("City Library", 3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

    }
}

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}

class Library {
    private String name;
    private Book[] books;
    private int numberOfBooks;

    public Library(String name, int capacity) {
        this.name = name;
        this.books = new Book[capacity];
        this.numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Library is full");
        }
    }

    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor());
        }
    }
}


