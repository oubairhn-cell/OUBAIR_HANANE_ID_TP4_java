class Rectangle extends Forme {
    double largeur, hauteur;

    Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    double calculerSurface() {
        return largeur * hauteur;
    }

    double calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }

    boolean validerDimensions() {
        return largeur > 0 && hauteur > 0;
    }

    void afficherDescription() {
        System.out.println("Rectangle - Largeur : " + largeur + " Hauteur : " + hauteur);
        System.out.println("Surface : " + calculerSurface());
        System.out.println("Perimetre : " + calculerPerimetre());
        System.out.println("Dimensions valides : " + validerDimensions());
    }
}