package be.ehb.notedroidapp.model;

import java.util.Date;

public class Note {
    //variabelen
    private String titel, inhoud;
    private Date aanmaakDatum;

    //constructor


    public Note() {
    }

    public Note(String titel, String inhoud, Date aanmaakDatum) {
        this.titel = titel;
        this.inhoud = inhoud;
        this.aanmaakDatum = aanmaakDatum;
    }

    //Getters & Setters
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getInhoud() {
        return inhoud;
    }

    public void setInhoud(String inhoud) {
        this.inhoud = inhoud;
    }

    public Date getAanmaakDatum() {
        return aanmaakDatum;
    }

    public void setAanmaakDatum(Date aanmaakDatum) {
        this.aanmaakDatum = aanmaakDatum;
    }
}
