class Compte {
    double solde;

    Compte(double solde) {
        this.solde = solde;
    }

    void deposer(double montant) {
        solde += montant;
        System.out.println("Depot : " + montant);
    }

    void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait : " + montant);
    }

    void consulterSolde() {
        System.out.println("Solde : " + solde);
    }

    void afficher() {
        System.out.println("Compte - Solde : " + solde);
    }
}