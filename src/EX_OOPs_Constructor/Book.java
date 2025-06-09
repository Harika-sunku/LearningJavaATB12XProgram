package EX_OOPs_Constructor;

public class Book {
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

        System.out.println("Title of the Book:"+ title);
        System.out.println("Author of the Book:"+ author);
        System.out.println("Price of the Book:"+ price);


    }

    public static void main(String[] args) {
        Book b=new Book("Three mistakes of life","Chethan Bhagath",250.00);
        Book b1=new Book("Hamlet","William Shakespeare",500.00);
    }


}
