package be.ehb.notedroidapp.model;

import java.util.ArrayList;
import java.util.Date;

public class NoteDAO {
    private static final NoteDAO ourInstance = new NoteDAO();
    private ArrayList<Note> noteLijst = new ArrayList<>();


    public static NoteDAO getInstance() {
        return ourInstance;
    }


    private NoteDAO() {
        noteLijst.add(new Note("Boodschappen" , "Ik moet sla en tomaten kopen", new Date()));
        noteLijst.add(new Note("Huistaken", "Huistaak wiskunde afwerken", new Date()));
        noteLijst.add(new Note("Sport", "Nike sportschoenen kopen", new Date()));
        noteLijst.add(new Note("Recept", "100g eieren, 100g suiker en 100g kaneel", new Date()));
        noteLijst.add(new Note("Boek", "Koop Rich dad Poor dad", new Date()));
    }

    public ArrayList<Note> getNoteLijst() {
        return noteLijst;
    }

    public void addNote(Note nieuweNote) {
        
    }
}
