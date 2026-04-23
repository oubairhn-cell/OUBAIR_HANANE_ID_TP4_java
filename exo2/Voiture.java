class Voiture extends Vehicule {
    int nbPortes;
    String carburant;

    Voiture(int nbPortes, String carburant) {
        super(null);
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