public class Main {
    public static void main(String[] args) {
 public class Main {
    public static void main(String[] args) {
        CompteCourant cc = new CompteCourant(1000, 500);
        cc.afficher();
        cc.deposer(200);
        cc.retirer(100);
        cc.autoriserDecouvert();
        cc.calculerFrais();
        cc.consulterSolde();

        System.out.println();

        CompteEpargne ce = new CompteEpargne(2000, 3);
        ce.afficher();
        ce.deposer(500);
        ce.ajouterInterets();
        ce.consulterSolde();
    }
}