public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Oubair", "Hanane", 21);
        p.afficherInformations();
        System.out.println(p.sePresenter());
        System.out.println(p.estMajeur());

        System.out.println();

        Etudiant e = new Etudiant("Oubair", "Hanane", 21, "ID", 15.5);
        e.afficherProfil();
    }
}