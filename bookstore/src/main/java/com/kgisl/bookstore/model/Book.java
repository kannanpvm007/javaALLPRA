package com.kgisl.bookstore.model;

/**
 * Book
 */
public class Book {

    protected int id;
    protected String title;
    protected String author;
    protected float price;

    public Book() {
        
	}
	public Book(int id, String title, String author, float price) {
        this.id=id;
        this.author=author;
        this.price=price;
        this.title=title;
	}
	public Book(String title, String author, float price) {
        this.author=author;
        this.price=price;
        this.title=title;
	}
	public Book(int id) {
    this.id=id;
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
    }/**
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
 public float getPrice() {
     return price;
 }
 /**
  * @param price the price to set
  */
 public void setPrice(float price) {
     this.price = price;
 }   
}