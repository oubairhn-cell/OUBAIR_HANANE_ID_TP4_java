class Cercle extends Forme {
    double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }

    double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    boolean validerDimensions() {
        return rayon > 0;
    }

    void afficherDescription() {
        System.out.println("Cercle - Rayon : " + rayon);
        System.out.println("Surface : " + calculerSurface());
        System.out.println("Perimetre : " + calculerPerimetre());
        System.out.println("Dimensions valides : " + validerDimensions());
    }
}