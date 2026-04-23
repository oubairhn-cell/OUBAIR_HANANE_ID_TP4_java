class Figure {
    void dessiner() {
        System.out.println("Dessin d'une figure");
    }

    void deplacer(int x, int y) {
        System.out.println("Deplacement vers x=" + x + " y=" + y);
    }

    void redimensionner(double facteur) {
        System.out.println("Redimensionnement par facteur : " + facteur);
    }
}