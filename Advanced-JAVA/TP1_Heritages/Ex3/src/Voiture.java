public class Voiture extends Vehicule {
    private String modele;
    private int annee;

    // Constructeur avec paramètres
    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    // Redéfinition de la méthode emettreSon
    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    // Redéfinition de la méthode afficherInformations
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Modèle: " + modele + ", Année: " + annee);
    }
}
