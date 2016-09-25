package jsf.domain;



import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.*;
import java.awt.event.ActionEvent;
import java.io.Serializable;

/**
 * Created by marij on 9/24/2016.
 */
@Entity
@Table( name="korisnik")
public class User implements Serializable {

    @Id
    @Column(name= "korisnikID")
    private int korisnikId;

    @Column(name= "Ime")
    private String ime;


    @Column(name= "Prezime")
    private String prezime;

    @Column(name = "username")
    public String user;

    @Column(name = "password")
    private int pass;

    public User() {
    }


    public void buttonAction(ActionEvent actionEvent) {
        addMessage("Su kuraaac!!");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }



    public User(int korisnikId, String ime, String prezime, String user, int pass) {
        this.korisnikId = korisnikId;
        this.ime = ime;
        this.prezime = prezime;
        this.user = user;
        this.pass = pass;
    }

    public int getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
