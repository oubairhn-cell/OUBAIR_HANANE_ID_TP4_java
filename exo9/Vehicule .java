abstract class Vehicule {
    int vitesse;

    void accelerer() {
        vitesse += 10;
        System.out.println("Acceleration - Vitesse : " + vitesse + " km/h");
    }

    void freiner() {
        vitesse -= 10;
        System.out.println("Freinage - Vitesse : " + vitesse + " km/h");
    }

    abstract void demarrer();
}