class Triangle extends Figure {
    double a, b, c, base, hauteur;

    Triangle(double a, double b, double c, double base, double hauteur) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.hauteur = hauteur;
    }

    void dessiner() {
        System.out.println("Dessin d'un triangle de cotes : " + a + ", " + b + ", " + c);
    }

    double calculerPerimetre() {
        return a + b + c;
    }

    double calculerSurface() {
        return (base * hauteur) / 2;
    }
}