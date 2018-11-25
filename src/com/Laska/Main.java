package com.Laska;

public class Main {

    public static void main(String[] args) {
	    Book test = new Book(0, "Test", "Me", "Also Me", 1400, 700, 123);
	    System.out.println(test);


	    System.out.println("------------------");
	    Book[] books = new Book[10];
	    for (int i = 0; i < books.length; i++) {
	        books[i] = new Book(i, "Test" + i, "Me" + i, "Also Me", 1400 + 5*i, 700 + 100*i, 123 + 20*i);//TODO - any more efficient way than create and copy??
	    }

    	Bookshelf shelf = new Bookshelf(books.length, books);
	    System.out.println(shelf);

	    System.out.println("------------------");
	    String author = "Me02";
	    System.out.println("Books by " + author + ":\n" + shelf.booksByAuthor(author));

    	System.out.println("------------------");
	    String publisher = "Also Me";
	    System.out.println("Books by " + publisher + ":\n" + shelf.booksByPublisher(publisher));

	    System.out.println("------------------");
	    int releaseDate = 1416;
	    System.out.println("Books released after " + releaseDate + ":\n" + shelf.booksLaterThan(releaseDate));

    }
}
