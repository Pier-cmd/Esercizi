package SLIDE;

import java.util.Random;

public class Macchina {
    private class Motore {
        private int cilindrata;
        private int numPistoni;

        public Motore(int cilindrata, int numPistoni) {
            this.cilindrata = cilindrata;
            this.numPistoni = numPistoni;
        }

        public int getCilindrata() {
            return this.cilindrata;
        }

        public int getNumPistoni() {
            return this.numPistoni;
        }
    }

    private class Freni {
        private int potenzaFrenante;
        private int numElementiFreni;

        public Freni(int potenzaFrenante, int numElementiFreni) {
            this.potenzaFrenante = potenzaFrenante;
            this.numElementiFreni = numElementiFreni;
        }

        public int getPotenzaFrenante() {
            return this.potenzaFrenante;
        }

        public int getNumElementiFreni() {
            return this.numElementiFreni;
        }
    }

    private Motore motore;
    private Freni freni;
    private String targa;

    public Macchina(int cilindrataScelta, int potenzaFrenante, int numElementiFreni) {
        this.targa = generaTargaCasuale();
        switch(cilindrataScelta) {
            case 1:
                this.motore = new Motore(1000, 4);
                break;
            case 2:
                this.motore = new Motore(1500, 4);
                break;
            case 3:
                this.motore = new Motore(2000, 6);
                break;
            default:
                this.motore = new Motore(1000, 4);
                break;
        }
        this.freni = new Freni(potenzaFrenante, numElementiFreni);
    }

    private String generaTargaCasuale() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 1 || i == 6) {
                sb.append((char) (random.nextInt(26) + 'A'));
            } else {
                sb.append(random.nextInt(10));
            }
        }
        return sb.toString();
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return this.targa;
    }

    public void stampaInfo() {
        System.out.println("Targa: " + this.targa);
        System.out.println("Cilindrata: " + this.motore.getCilindrata() + "cc");
        System.out.println("Numero di pistoni: " + this.motore.getNumPistoni());
        System.out.println("Potenza frenante: " + this.freni.getPotenzaFrenante() + " N");
        System.out.println("Numero di elementi frenanti: " + this.freni.getNumElementiFreni());
    }
}    