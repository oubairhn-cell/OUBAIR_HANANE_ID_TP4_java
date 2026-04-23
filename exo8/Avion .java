class Avion implements Volant {
    String modele;
    int altitude;

    Avion(String modele) {
        this.modele = modele;
    }

    public void voler() {
        System.out.println(modele + " decolle et vole");
    }

    public void atterrir() {
        System.out.println(modele + " atterrit sur la piste");
    }

    public void changerAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println(modele + " change d'altitude a : " + altitude + "m");
    }

    void embarquerPassagers() {
        System.out.println(modele + " embarque les passagers");
    }

    void afficherAltitude() {
        System.out.println(modele + " altitude actuelle : " + altitude + "m");
    }
}