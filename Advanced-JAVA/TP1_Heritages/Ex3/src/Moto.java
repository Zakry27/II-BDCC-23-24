public class Moto extends Vehicule {
    private String marque;
    private int puissance;

    // Constructeur avec paramètres
    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    // Redéfinition de la méthode emettreSon
    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    // Redéfinition de la méthode afficherInformations
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Marque: " + marque + ", Puissance: " + puissance + " chevaux");
    }
}
