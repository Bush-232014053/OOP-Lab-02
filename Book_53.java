/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book_53;

/**
 *
 * @author pc
 */
class Book_53 {
    private String title;
    private String author;
    private int year;
    private static String genre;
    private static int bookCount = 0;
    public Book_53(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }
    public static void setGenre(String genre) {
        Book_53.genre = genre;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }
    public static void displayTotalBooks() {
        System.out.println("Total Number of Books: " + bookCount);
    }
    public static void main(String[] args) {
        Book_53.setGenre("Fiction");

        Book_53 book1 = new Book_53("Bahubali", "Rajamouli", 2016);
        Book_53 book2 = new Book_53("1917", "Sam Mendes", 2019);
        Book_53 book3 = new Book_53("Titanic", "James Cameron", 1997);
     
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
        Book_53.displayTotalBooks();
    }
}
