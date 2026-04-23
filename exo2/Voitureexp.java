class Voitureexp extends Vehicule {
    int nbPortes;
    String carburant;

    Voiture(String marque, int nbPortes, String carburant) {
        super(marque);
        this.nbPortes = nbPortes;
        this.carburant = carburant;
    }

    void afficherDetails() {
        System.out.println(marque + " " + nbPortes + " " + carburant);
    }

    void klaxonner() {
        System.out.println(marque + " beep beep");
    }
}