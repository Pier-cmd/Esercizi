package pari.ParteNuovaMet;

class Giocatore {
    private String nome;
    private String cognome;

    public Giocatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }
}