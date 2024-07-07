public class TestVehicules {
    public static void main(String[] args) {
        // Création d'une voiture
        Voiture voiture = new Voiture("Voiture1", 20000, "Tesla Model S", 2022);
        voiture.emettreSon();
        voiture.afficherInformations();

        // Création d'une moto
        Moto moto = new Moto("Moto1", 15000, "Yamaha", 120);
        moto.emettreSon();
        moto.afficherInformations();

        // Création d'un avion
        Avion avion = new Avion("Avion1", 150000, "Air France", 900);
        avion.emettreSon();
        avion.afficherInformations();
    }
}
