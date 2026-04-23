public class Main {
    public static void main(String[] args) {
        VoitureElectrique ve = new VoitureElectrique(80, 300);
        ve.demarrer();
        ve.accelerer();
        ve.accelerer();
        ve.freiner();
        ve.verifierBatterie();
        ve.charger();
        ve.afficherAutonomie();
        ve.optimiserConsommation();

        System.out.println();

        Moto m = new Moto("Sportive");
        m.demarrer();
        m.accelerer();
        m.accelerer();
        m.freiner();
        m.afficherTypeMoto();
        m.faireRoueArriere();
    }
}