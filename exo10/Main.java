import java.util.ArrayList;

public class Main {

    static ArrayList<Document> documents = new ArrayList<>();

    static void rechercherParTitre(String titre) {
        System.out.println("Recherche par titre : " + titre);
        for (Document d : documents) {
            if (d.titre.toLowerCase().contains(titre.toLowerCase())) {
                d.afficherInformations();
            }
        }
    }

    static void rechercherParAuteur(String auteur) {
        System.out.println("Recherche par auteur : " + auteur);
        for (Document d : documents) {
            if (d.auteur.toLowerCase().contains(auteur.toLowerCase())) {
                d.afficherInformations();
            }
        }
    }

    static void afficherDisponibles() {
        System.out.println("Documents disponibles :");
        for (Document d : documents) {
            if (d.disponible) {
                d.afficherInformations();
            }
        }
    }

    public static void main(String[] args) {
        Livre l = new Livre("L001", "Le Petit Prince", "Saint-Exupery", 96, "Roman");
        Magazine m = new Magazine("M001", "Science et Vie", "Collectif", 1200, "2025-01");
        DocumentNumerique dn = new DocumentNumerique("N001", "Java POO", "Martin", "PDF", 5.4);

        documents.add(l);
        documents.add(m);
        documents.add(dn);

        System.out.println("=== Affichage polymorphisme ===");
        for (Document d : documents) {
            d.afficherInformations();
            System.out.println("Duree max : " + d.calculerDureeEmpruntMax() + " jours");
            System.out.println();
        }

        System.out.println("=== Emprunt ===");
        Utilisateur u = new Utilisateur("U001", "Ali");
        u.emprunterDocument(l);
        u.emprunterDocument(m);
        u.emprunterDocument(l);

        System.out.println();
        System.out.println("=== Retour ===");
        u.retournerDocument(l);

        System.out.println();
        System.out.println("=== Historique ===");
        u.afficherHistorique();

        System.out.println();
        System.out.println("=== Document Numerique ===");
        dn.consulter();
        dn.telecharger();
        dn.afficherTaille();
        dn.afficherResume();

        System.out.println();
        System.out.println("=== Recherche ===");
        rechercherParTitre("java");
        System.out.println();
        rechercherParAuteur("martin");

        System.out.println();
        System.out.println("=== Disponibles ===");
        afficherDisponibles();

        System.out.println();
        System.out.println("=== Details Livre ===");
        l.afficherDetails();
        l.recommander();

        System.out.println();
        System.out.println("=== Edition Magazine ===");
        m.afficherEdition();
    }
}