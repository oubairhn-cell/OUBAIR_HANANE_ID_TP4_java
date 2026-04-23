class Personne {
    String nom, prenom;
    int age;

    Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    void afficherInformations() {
        System.out.println(nom + " " + prenom + " " + age);
    }

    boolean estMajeur() {
        return age >= 18;
    }

    String sePresenter() {
        return "Je suis " + prenom + " " + nom + " j'ai " + age + " ans";
    }
}