public abstract class Figure {
    protected String nom;

    // Constructeur avec paramètre
    public Figure(String nom) {
        this.nom = nom;
    }

    // Méthode abstraite pour calculer l'aire
    public abstract double calculerAire();

    // Méthode abstraite pour calculer le périmètre
    public abstract double calculerPerimetre();

    // Méthode pour afficher les détails de la figure
    public void afficherDetails() {
        System.out.println("Nom de la figure: " + nom);
        System.out.println("Aire: " + calculerAire() + " unités carrées");
        System.out.println("Périmètre: " + calculerPerimetre() + " unités");
    }
}
