class CompteCourant extends Compte {
    double decouvert;

    CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    void autoriserDecouvert() {
        System.out.println("Decouvert autorise : " + decouvert);
    }

    void calculerFrais() {
        double frais = solde * 0.02;
        System.out.println("Frais : " + frais);
    }

    void afficher() {
        System.out.println("Compte Courant - Solde : " + solde + " | Decouvert : " + decouvert);
    }
}