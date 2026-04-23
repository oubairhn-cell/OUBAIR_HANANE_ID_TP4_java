public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        r.afficherDescription();

        System.out.println();

        Cercle c = new Cercle(4);
        c.afficherDescription();

        System.out.println();

        r.comparerSurface(c);
    }
}