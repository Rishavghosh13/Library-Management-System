package com.rishav.LibraryManagementSystemApp.DatabaseStore;

import jakarta.persistence.*;

@Entity
@Table(name="book_details_info")
public class BookDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bookId;
    String bookName;
    String authorName;
    String lendId;

    public BookDetails() {

    }
    public BookDetails(int bookId, String bookName, String authorName, String lendId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.lendId = lendId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setLendId(String lendId) {
        this.lendId = lendId;
    }



    public String getLendId() {
        return lendId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookId() {
        return bookId;
    }






}
