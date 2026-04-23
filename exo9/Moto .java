class Moto extends Vehicule {
    String type;

    Moto(String type) {
        this.type = type;
    }

    void demarrer() {
        System.out.println("La moto demarre avec un gros bruit");
    }

    void faireRoueArriere() {
        System.out.println("La moto fait une roue arriere !");
    }

    void afficherTypeMoto() {
        System.out.println("Type de moto : " + type);
    }
}