package pari.ParteNuovaMet;


public void inserisciDirigente(Dirigente dirigente) {
    if (this.dirigenti == null) {
        this.dirigenti = new ArrayList<Dirigente>();
    }
    this.dirigenti.add(dirigente);
} 
