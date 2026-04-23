import java.util.ArrayList;

class Utilisateur {
    String identifiant, nom;
    ArrayList<String> historique = new ArrayList<>();

    Utilisateur(String identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    void emprunterDocument(Document d) {
        d.emprunter();
        historique.add("Emprunte : " + d.titre);
    }

    void retournerDocument(Document d) {
        d.retourner();
        historique.add("Retourne : " + d.titre);
    }

    void afficherHistorique() {
        System.out.println("Historique de " + nom + " :");
        for (String h : historique) {
            System.out.println("  - " + h);
        }
    }
}