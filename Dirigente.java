package pari.ParteNuovaMet;

class Dirigente {
    private String nome;
    private String cognome;

    public Dirigente(String nome, String cognome) {
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
