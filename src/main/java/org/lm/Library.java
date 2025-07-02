package org.lm;

import java.util.List;

public class Library {

    private String libraryName;

    private String libraryAddress;

    private List<Patron> patronList;

    private List<Book> bookCollection;

    private BooksManagementSystem managementSystem;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }


    public List<Patron> getPatronList() {
        return patronList;
    }

    public void setPatronList(List<Patron> patronList) {
        this.patronList = patronList;
    }

    public List<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }


    public void addBook(Book book) {
        this.bookCollection.add(book);
    }

    public void removeBook(Book book) {
        this.bookCollection.remove(book);
    }

    public BooksManagementSystem getManagementSystem() {
        return managementSystem;
    }

    public void setManagementSystem(BooksManagementSystem managementSystem) {
        this.managementSystem = managementSystem;
    }
}
