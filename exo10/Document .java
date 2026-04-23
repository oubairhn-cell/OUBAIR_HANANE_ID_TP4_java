abstract class Document {
    String identifiant, titre, auteur;
    boolean disponible;

    Document(String identifiant, String titre, String auteur) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true;
    }

    void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println(titre + " emprunte avec succes");
        } else {
            System.out.println(titre + " n'est pas disponible");
        }
    }

    void retourner() {
        disponible = true;
        System.out.println(titre + " retourne avec succes");
    }

    void afficherInformations() {
        System.out.println("ID : " + identifiant + " | Titre : " + titre + " | Auteur : " + auteur + " | Disponible : " + disponible);
    }

    abstract int calculerDureeEmpruntMax();
}