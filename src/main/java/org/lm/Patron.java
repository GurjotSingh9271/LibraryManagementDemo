package org.lm;

import java.util.List;

public class Patron {

    private String name;

    private String patronId;

    private String email;

    private LibraryCard libraryCard;



    public Patron(String name, String patronId, String email,LibraryCard libraryCard) {
        this.name = name;
        this.patronId = patronId;
        this.email = email;
        this.libraryCard = libraryCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void updatePatronInformation(Patron patron,String name, String patronId, String email) {

        patron.setName(name);
        patron.setPatronId(patronId);
        patron.setEmail(email);
    }


}
