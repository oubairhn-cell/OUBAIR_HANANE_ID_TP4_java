class Oiseau implements Volant {
    String nom;

    Oiseau(String nom) {
        this.nom = nom;
    }

    public void voler() {
        System.out.println(nom + " vole en battant des ailes");
    }

    public void atterrir() {
        System.out.println(nom + " se pose sur une branche");
    }

    public void changerAltitude(int altitude) {
        System.out.println(nom + " change d'altitude a : " + altitude + "m");
    }

    void migrer() {
        System.out.println(nom + " migre vers le sud");
    }

    void construireNid() {
        System.out.println(nom + " construit son nid");
    }
}