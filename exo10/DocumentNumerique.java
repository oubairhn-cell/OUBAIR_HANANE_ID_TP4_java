class DocumentNumerique extends Document implements Consultable {
    String format;
    double tailleFichier;

    DocumentNumerique(String identifiant, String titre, String auteur, String format, double tailleFichier) {
        super(identifiant, titre, auteur);
        this.format = format;
        this.tailleFichier = tailleFichier;
    }

    public int calculerDureeEmpruntMax() {
        return 14;
    }

    public void consulter() {
        System.out.println(titre + " en cours de consultation en ligne");
    }

    public void afficherResume() {
        System.out.println("Resume de : " + titre + " par " + auteur);
    }

    void telecharger() {
        System.out.println(titre + " telecharge en format " + format);
    }

    void afficherTaille() {
        System.out.println("Taille : " + tailleFichier + " MB");
    }
}