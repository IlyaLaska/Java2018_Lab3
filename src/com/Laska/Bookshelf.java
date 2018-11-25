package com.Laska;

public class Bookshelf {
    private int length;
    private Book[] books;

    /**
     * initialises books array using random stuff
     *
     * @param length - intialises books array of this size
     */
    Bookshelf(int length) {
        this.length = length;
        this.books = new Book[length];
    }

    Bookshelf(int length, Book[] books) {
        this.length = length;
        this.books = books;
    }

    @Override
    public String toString() {
        if (length == 0) return new String("The bookshelf is empty");
        StringBuilder out = new StringBuilder();
//        String outShelf = "";
        for (Book book : books) {
            out.append(book).append("\n");
//            outShelf += book + " ";
        }
        out.deleteCharAt(out.length() - 1);//cleaning last \n
        return out.toString();
    }

    /**
     * returns a Bookshelf of books by a certain author
     *
     * @param author author to search for
     * @return new Bookshelf with books by desired author only
     */
    Bookshelf booksByAuthor(String author) {
        int matches = 0;
        for (int i = 0; i < length; i++) {
            if (books[i].getAuthor().equals(author)) matches++;
        }
        if (matches == 0) return new Bookshelf(0);//empty Bookshelf if no matches found

        Bookshelf outBookshelf = new Bookshelf(matches);
        int outPos = 0;
        for (int i = 0; i < length; i++) {
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
        for (int i = 0; i < length; i++) {
            if (books[i].getPublisher().equals(publisher)) matches++;
        }
        if (matches == 0) return new Bookshelf(0);//empty Bookshelf if no matches found

        Bookshelf outBookshelf = new Bookshelf(matches);
        int outPos = 0;
        for (int i = 0; i < length; i++) {
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
        for (int i = 0; i < length; i++) {
            if (books[i].getReleaseDate() > releaseDate) matches++;
        }
        if (matches == 0) return new Bookshelf(0);//empty Bookshelf if no matches found

        Bookshelf outBookshelf = new Bookshelf(matches);
        int outPos = 0;
        for (int i = 0; i < length; i++) {
            if (books[i].getReleaseDate() > releaseDate) {
                outBookshelf.books[outPos] = books[i];
                outPos++;
            }
        }
        return outBookshelf;
    }
}
