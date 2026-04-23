class Livre extends Document implements Empruntable {
    int nombreDePages;
    String genre;

    Livre(String identifiant, String titre, String auteur, int nombreDePages, String genre) {
        super(identifiant, titre, auteur);
        this.nombreDePages = nombreDePages;
        this.genre = genre;
    }

    public int calculerDureeEmpruntMax() {
        return 21;
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void reserver() {
        System.out.println(titre + " reserve");
    }

    void afficherDetails() {
        afficherInformations();
        System.out.println("Pages : " + nombreDePages + " | Genre : " + genre + " | Duree max : " + calculerDureeEmpruntMax() + " jours");
    }

    void recommander() {
        System.out.println("Livre recommande : " + titre + " de " + auteur);
    }
}