package org.lm;

import java.util.List;

public class PatronManagementSystem {

    private Patron patron;

    public PatronManagementSystem(Patron patron) {
        this.patron = patron;
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public void updatePatronInformation(Library library, String name, String patronId, String email) {
        library.getPatronList().stream().filter(patron -> patron.getPatronId().equals(patronId))
                .findFirst()
                .ifPresent(patron -> patron.updatePatronInformation(patron, name, patronId, email));

    }

    public void addPatron(Library library,Patron patron) {
        library.getPatronList().add(patron);
    }

    public void removePatron(Library library,Patron patron) {
        library.getPatronList().remove(patron);
    }

    public List<Record> getPatronBookingHistory(Patron patron) {
        return patron.getLibraryCard().getRecords();
    }

}
