class Etudiant extends Personne {
    String niveau;
    double moyenne;

    Etudiant(String nom, String prenom, int age, String niveau, double moyenne) {
        super(nom, prenom, age);
        this.niveau = niveau;
        this.moyenne = moyenne;
    }

    String calculerMention() {
        if (moyenne >= 16) return "Tres Bien";
        if (moyenne >= 14) return "Bien";
        if (moyenne >= 12) return "Assez Bien";
        if (moyenne >= 10) return "Passable";
        return "Insuffisant";
    }

    boolean estAdmis() {
        return moyenne >= 10;
    }

    void afficherProfil() {
        afficherInformations();
        System.out.println(niveau);
        System.out.println(moyenne);
        System.out.println(calculerMention());
        System.out.println(estAdmis());
    }
}