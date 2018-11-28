package com.Laska;

class Printer {
    /**
     * uses Bookshelf's inbuilt toString() function
     *
     * @param shelf Bookshelf to be printed
     */
    static void listBookshelf(Bookshelf shelf) {
        System.out.println(shelf);
    }

    /**
     * lists Bookshelf as a table
     *
     * @param shelf Bookshelf to be printed
     */
    static void listBookshelfAsTable(Bookshelf shelf) {
        System.out.println("  --------------------------------------------------------");
        System.out.format("%4s %6s %7s %10s %12s %7s %6s\n", "Id", "Title", "Author", "Publisher", "ReleaseDate",
                "Length", "Price");
        System.out.println("  --------------------------------------------------------");
        for (int i = 0; i < shelf.getSize(); i++) {
            System.out.println("  --------------------------------------------------------");
            System.out.format("%4s %6s %7s %10s %12s %7s %6s\n", shelf.getBooks()[i].getId(),
                    shelf.getBooks()[i].getTitle(), shelf.getBooks()[i].getAuthor(), shelf.getBooks()[i].getPublisher(),
                    shelf.getBooks()[i].getReleaseDate(), shelf.getBooks()[i].getLength(), shelf.getBooks()[i].getPrice());
        }
    }
}