public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    // Constructeur avec paramètres
    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Redéfinition de la méthode calculerAire
    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    // Redéfinition de la méthode calculerPerimetre
    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
}
