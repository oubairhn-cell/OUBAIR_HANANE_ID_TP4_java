abstract class Forme {
    abstract double calculerSurface();

    void afficherDescription() {
        System.out.println("Surface : " + calculerSurface());
    }

    void comparerSurface(Forme f) {
        if (calculerSurface() > f.calculerSurface()) {
            System.out.println("Cette forme est plus grande");
        } else if (calculerSurface() < f.calculerSurface()) {
            System.out.println("Cette forme est plus petite");
        } else {
            System.out.println("Les deux formes ont la meme surface");
        }
    }
}