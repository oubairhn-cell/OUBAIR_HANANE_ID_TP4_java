class VoitureElectrique extends Vehicule implements Electrique {
    int batterie;
    int autonomie;

    VoitureElectrique(int batterie, int autonomie) {
        this.batterie = batterie;
        this.autonomie = autonomie;
    }

    void demarrer() {
        System.out.println("Voiture electrique demarre silencieusement");
    }

    public void charger() {
        batterie = 100;
        System.out.println("Batterie chargee a 100%");
    }

    public void verifierBatterie() {
        System.out.println("Batterie : " + batterie + "%");
    }

    void afficherAutonomie() {
        System.out.println("Autonomie : " + autonomie + " km");
    }

    void optimiserConsommation() {
        autonomie += 20;
        System.out.println("Consommation optimisee - Nouvelle autonomie : " + autonomie + " km");
    }
}