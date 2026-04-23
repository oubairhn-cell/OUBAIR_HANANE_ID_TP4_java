class Cercle extends Figure {
    double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }

    void dessiner() {
        System.out.println("Dessin d'un cercle de rayon : " + rayon);
    }

    double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}