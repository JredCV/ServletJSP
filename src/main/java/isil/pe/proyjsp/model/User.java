package isil.pe.proyjsp.model;

public class User {

    private String nomCli;
    private String apeCli;
    private String dni;
    private String email;
    private String username;
    private String pass;

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public User(String nomCli, String apeCli, String dni, String email, String username, String pass) {
        this.nomCli = nomCli;
        this.apeCli = apeCli;
        this.dni = dni;
        this.email = email;
        this.username = username;
        this.pass = pass;
    }

    public User(){

    }


}
