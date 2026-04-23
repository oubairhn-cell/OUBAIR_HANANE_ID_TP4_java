public class Main {
    public static void main(String[] args) {
        Oiseau o = new Oiseau("Aigle");
        o.voler();
        o.changerAltitude(500);
        o.migrer();
        o.construireNid();
        o.atterrir();

        System.out.println();

        Avion a = new Avion("Boeing 737");
        a.embarquerPassagers();
        a.voler();
        a.changerAltitude(10000);
        a.afficherAltitude();
        a.atterrir();

        System.out.println();

        Volant[] volants = {new Oiseau("Hirondelle"), new Avion("Airbus A320")};
        for (Volant v : volants) {
            v.voler();
            v.atterrir();
        }
    }
}