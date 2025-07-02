package org.lm;
import java.util.List;
import java.util.Optional;

public class BooksManagementSystem {

    public void lendBook(Library library,Book book, Patron patron) {
        // Logic to lend a book to a patron
        System.out.println("Lending book: " + book.getTitle() + " to patron: " + patron.getName());
       if(patron.getLibraryCard().getRecords().stream().anyMatch(
               record -> record.getCheckoutDate()!=null)){
           System.out.println("Patron already has book - " + book.getTitle() + " which is not yet returned. ");

       }  else {
        System.out.println("Book Lent Successfully");
           patron.getLibraryCard().addRecord(book);
       }

    }

    public  void returnBook(Library library,Book book, Patron patron) {
        System.out.println("Returning book: " + book.getTitle() + " to patron: " + patron.getName());
        patron.getLibraryCard().updateReturnDate(book);
        System.out.println("Book Return Successfully");

        Optional<Patron> reservedPatron =
                library.getPatronList().stream().filter(patrons->patrons.getLibraryCard().getReservation().getBook().equals(book)).findFirst();

        reservedPatron.ifPresent(value -> System.out.println("Patron " + value.getEmail() + " has been notified"));

    }

    public Book searchBookByTitle(Library library, String title) {
     Optional<Book> bookByTitle = library.getBookCollection().stream().filter(book -> book.getTitle().equals(title)).findFirst();
     if(bookByTitle.isPresent()) {
         System.out.println("Book found: " + bookByTitle.get().getTitle() + " by " + bookByTitle.get().getAuthor());
     } else {
         System.out.println("Book not found with title: " + title);
     }
        return bookByTitle.orElse(null);
    }

    public Book searchBookByAuthor(Library library, String author) {
        Optional<Book> bookByAuthor = library.getBookCollection().stream().filter(book -> book.getAuthor().equals(author)).findFirst();
        if(bookByAuthor.isPresent()) {
            System.out.println("Book found: " + bookByAuthor.get().getTitle() + " by " + bookByAuthor.get().getAuthor());
        } else {
            System.out.println("Book not found with author: " + author);
        }
        return bookByAuthor.orElse(null);
    }

    public Book searchBookByISBN(Library library, String isbn) {
        Optional<Book> bookByISBN = library.getBookCollection().stream().filter(book -> book.getIsbn().equals(isbn)).findFirst();
        if(bookByISBN.isPresent()) {
            System.out.println("Book found: " + bookByISBN.get().getTitle() + " with ISBN: " + bookByISBN.get().getIsbn());
        } else {
            System.out.println("Book not found with ISBN: " + isbn);
        }
        return bookByISBN.orElse(null);
    }

}
