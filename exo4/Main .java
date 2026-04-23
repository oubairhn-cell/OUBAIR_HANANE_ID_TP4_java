public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien();
        chien.crier();
        chien.manger();
        chien.dormir();
        chien.garder();
        chien.jouer();

        System.out.println();

        Chat chat = new Chat();
        chat.crier();
        chat.manger();
        chat.dormir();
        chat.ronronner();
        chat.grimper();

        System.out.println();

        Animal[] animaux = {new Chien(), new Chat()};
        for (Animal a : animaux) {
            a.crier();
        }
    }
}