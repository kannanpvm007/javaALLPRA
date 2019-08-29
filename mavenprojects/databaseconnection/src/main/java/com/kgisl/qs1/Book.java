package com.kgisl.qs1;

/**
 * Book
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private int price;
    private int qty;

    public Book(int id, String title, String author, int price, int qty) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
        this.setQty(qty);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        return id+" "+title+" "+author+" "+price+" "+qty;
    }
}