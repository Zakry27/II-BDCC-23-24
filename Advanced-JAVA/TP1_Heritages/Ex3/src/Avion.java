public class Avion extends Vehicule {
    private String compagnie;
    private int vitesseMax;

    // Constructeur avec paramètres
    public Avion(String nom, double prix, String compagnie, int vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    // Redéfinition de la méthode emettreSon
    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    // Redéfinition de la méthode afficherInformations
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie: " + compagnie + ", Vitesse max: " + vitesseMax + " km/h");
    }
}
