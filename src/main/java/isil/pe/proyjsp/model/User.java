package isil.pe.proyjsp.model;

public class User {

    private String document;
    private String mail;
    private String username;
    private String pass;

    public User() {

    }

    public String getDocument() {
        return document;
    }

    public User(String document, String mail, String username, String pass) {
        this.document = document;
        this.mail = mail;
        this.username = username;
        this.pass = pass;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }



}
