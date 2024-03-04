//Clase expediente: Identifica un expediente de delitos

import java.util.ArrayList;
//Libreria para obtener la fecha
import java.util.Date;
import java.util.List;
//Libreria para generar un identificador unico
import java.util.UUID;

public class CaseFile {
    private Date creationDate;
    private String identifier;
    private String description;
    private List<Person> complainants;
    private List<Person> accused;
    private List<Person> victims;
    private List<Crime> crimesAccused;
    private List<Crime> crimesVictims;

    public CaseFile(String description) {
        this.creationDate = new Date();
        this.identifier = UUID.randomUUID().toString();
        this.description = description;
        this.complainants = new ArrayList<>();
        this.accused = new ArrayList<>();
        this.victims = new ArrayList<>();
        this.crimesAccused = new ArrayList<>();
        this.crimesVictims = new ArrayList<>();
    }

    //Metodos para crear un expediente 
    
    public Date getCreationDate() {
        return creationDate;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public List<Person> getComplainants() {
        return complainants;
    }

    public List<Person> getAccused() {
        return accused;
    }

    public List<Crime> getCrimesAccused() {
        return crimesAccused;
    }

    public List<Person> getVictims() {
        return victims;
    }

    public List<Crime> getCrimesVictims() {
        return crimesVictims;
    }

    public void addComplainant(Person person) {
        complainants.add(person);
    }

    public void addAccused(Person person, Crime crime) {
        accused.add(person);
        crimesAccused.add(crime);
    }

    public void addVictim(Person person, Crime crime) {
        victims.add(person);
        crimesVictims.add(crime);
    }

}