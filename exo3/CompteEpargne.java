class CompteEpargne extends Compte {
    double taux;

    CompteEpargne(double solde, double taux) {
        super(solde);
        this.taux = taux;
    }

    double calculerInterets() {
        return solde * taux / 100;
    }

    void ajouterInterets() {
        double interets = calculerInterets();
        solde += interets;
        System.out.println("Interets ajoutes : " + interets);
    }

    void afficher() {
        System.out.println("Compte Epargne - Solde : " + solde + " | Taux : " + taux + "%");
    }
}