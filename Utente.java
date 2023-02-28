package pari.ParteNuovaMet;

public class Utente {
    private String username;
    private String password;
    private int livello;

    public Utente(String username, String password, int livello) {
        this.username = username;
        this.password = password;
        this.livello = livello;
    }

    public String getUsername() {
        return username;
    }

    public boolean verificaPassword(String password) {
        return this.password.equals(password);
    }

    public int getLivello() {
        return livello;
    }

    public String getPassword() {
        return null;
    }
}
