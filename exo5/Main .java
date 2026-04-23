public class Main {
    public static void main(String[] args) {
        Cercle c = new Cercle(5);
        c.dessiner();
        c.deplacer(10, 20);
        c.redimensionner(2);
        System.out.println("Perimetre : " + c.calculerPerimetre());
        System.out.println("Surface : " + c.calculerSurface());

        System.out.println();

        Triangle t = new Triangle(3, 4, 5, 3, 4);
        t.dessiner();
        t.deplacer(5, 10);
        t.redimensionner(3);
        System.out.println("Perimetre : " + t.calculerPerimetre());
        System.out.println("Surface : " + t.calculerSurface());

        System.out.println();

        Figure[] figures = {new Cercle(7), new Triangle(6, 8, 10, 6, 8)};
        for (Figure f : figures) {
            f.dessiner();
        }
    }
}