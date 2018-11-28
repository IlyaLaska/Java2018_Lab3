package com.Laska;

public class Bookshelf {
    private Book[] books;

    /**
     * initialises books array using random stuff
     *
     * @param length - intialises books array of this size
     */
    Bookshelf(int length) {
        this.books = new Book[length];
    }

    Bookshelf(Book[] books) {
        this.books = books;
    }

    /**
     * @return the size of the Book array
     */
    int getSize() {
        return this.books.length;
    }

    Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        if (this.books.length == 0) return "The bookshelf is empty";
        StringBuilder outString = new StringBuilder();
        for (Book book : books) {
            outString.append(book).append("\n");
        }
        outString.deleteCharAt(outString.length() - 1);//cleaning last \n
        return outString.toString();
    }

    /**
     * returns a Bookshelf of books by a certain author
     *
     * @param author author to search for
     * @return new Bookshelf with books by desired author only
     */
    Bookshelf booksByAuthor(String author) {
        int matches = 0;
        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) matches++;
        }
        if (matches == 0) return new Bookshelf(0);//empty Bookshelf if no matches found

        Bookshelf outBookshelf = new Bookshelf(matches);
        int outPos = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                outBookshelf.books[outPos] = books[i];
                outPos++;
            }
        }
        return outBookshelf;
    }

    /**
     * returns a Bookshelf of books by a certain publisher
     *
     * @param publisher publisher to search for
     * @return new Bookshelf with books by desired publisher only
     */
    Bookshelf booksByPublisher(String publisher) {
        int matches = 0;
        for (Book book : this.books) {
            if (book.getPublisher().equals(publisher)) matches++;
        }
        if (matches == 0) return new Bookshelf(0);//empty Bookshelf if no matches found

        Bookshelf outBookshelf = new Bookshelf(matches);
        int outPos = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (books[i].getPublisher().equals(publisher)) {
                outBookshelf.books[outPos] = books[i];
                outPos++;
            }
        }
        return outBookshelf;
    }

    /**
     * returns a Bookshelf of books released later than a certain year
     *
     * @param releaseDate return Books after this year
     * @return new Bookshelf with books released later than in the desired year
     */
    Bookshelf booksLaterThan(int releaseDate) {
        int matches = 0;
        for (Book book : this.books) {
            if (book.getReleaseDate() > releaseDate) matches++;
        }
        if (matches == 0) return new Bookshelf(0);//empty Bookshelf if no matches found

        Bookshelf outBookshelf = new Bookshelf(matches);
        int outPos = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (books[i].getReleaseDate() > releaseDate) {
                outBookshelf.books[outPos] = books[i];
                outPos++;
            }
        }
        return outBookshelf;
    }
}
