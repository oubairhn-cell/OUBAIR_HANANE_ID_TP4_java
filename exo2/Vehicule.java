class Vehicule {
    String marque;

    Vehicule(String marque) {
        this.marque = marque;
    }

    void afficherMarque() {
        System.out.println(marque);
    }

    void demarrer() {
        System.out.println(marque + " demarre");
    }

    void arreter() {
        System.out.println(marque + " arrete");
    }
}