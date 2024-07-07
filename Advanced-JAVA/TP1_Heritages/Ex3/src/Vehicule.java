public class Vehicule {
    private String nom;
    private double prix;

    // Constructeur avec paramètres
    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Méthode pour émettre un son générique
    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    // Méthode pour afficher les informations de base
    public void afficherInformations() {
        System.out.println("Nom: " + nom + ", Prix: " + prix + "€");
    }
}
