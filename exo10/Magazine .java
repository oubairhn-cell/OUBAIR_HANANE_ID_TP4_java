class Magazine extends Document implements Empruntable {
    int numero;
    String datePublication;

    Magazine(String identifiant, String titre, String auteur, int numero, String datePublication) {
        super(identifiant, titre, auteur);
        this.numero = numero;
        this.datePublication = datePublication;
    }

    public int calculerDureeEmpruntMax() {
        return 7;
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void reserver() {
        System.out.println(titre + " numero " + numero + " reserve");
    }

    boolean estRecent() {
        return datePublication.contains("2024") || datePublication.contains("2025");
    }

    void afficherEdition() {
        afficherInformations();
        System.out.println("Numero : " + numero + " | Date : " + datePublication + " | Recent : " + estRecent());
    }
}