package org.lm;

import java.util.ArrayList;
import  java.util.Date;
import java.util.List;

public class LibraryCard {

    private String cardNumber;

    private List<Record> records;

    private Record reservation;

    private String expirationDate;

    public LibraryCard(String cardNumber, List<Record> records, String expirationDate) {
        this.cardNumber = cardNumber;
        this.records = records;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Record getReservation() {
        return reservation;
    }

    public void setReservation(Record reservation) {
        this.reservation = reservation;
    }

    public boolean addRecord(Book book){
        // Logic to lend a book
        if(records==null){
            records = new ArrayList<Record>();
        }
        Record record = new Record(book,new Date());
        return records.add(record);
    }

    public void updateReturnDate (Book book){
        Record record = this.records.stream().filter
                (existingRecord -> existingRecord.getBook().getTitle().equals(book.getTitle())).findFirst().get();
        record.setReturnDate(new Date());
    }


}
