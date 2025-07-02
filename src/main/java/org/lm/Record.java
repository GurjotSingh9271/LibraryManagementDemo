package org.lm;
import  java.util.Date;

public class Record {

    private Book book;

    private Date checkoutDate;

    private Date dueDate;

    private Date returnDate;

    public Record(Book book,Date checkoutDate){
        this.book=book;
        this.checkoutDate=checkoutDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String toString(){
        return  "Book with title " + book.getTitle() +
                "was borrowed on " + checkoutDate + (returnDate == null ? " and is due on " + dueDate :
                " and was returned on " + returnDate) ;
    }

}
