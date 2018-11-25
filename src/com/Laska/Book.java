package com.Laska;

class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int releaseDate;// = Calendar.get(Calendar.YEAR);
    private int length;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Book(int id, String title, String author, String publisher, int releaseDate, int length, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.length = length;
        this.price = price;
    }

    /**
     * used by System.out
     *
     * @return Sentence describing a book
     */
    @Override
    public String toString() {
        return String.format("The Book with id %d by the title of %s was written by %s and published by %s in %d." +
                " It consists of %d pages and costs $%d.", id, title, author, publisher, releaseDate, length, price);
    }
}
