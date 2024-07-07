public class TestFigures {
    public static void main(String[] args) {
        // Création d'un cercle
        Cercle cercle = new Cercle("Cercle1", 5.0);

        // Création d'un rectangle
        Rectangle rectangle = new Rectangle("Rectangle1", 4.0, 6.0);

        // Affichage des détails du cercle
        System.out.println("Détails du cercle:");
        cercle.afficherDetails();

        // Affichage des détails du rectangle
        System.out.println("\nDétails du rectangle:");
        rectangle.afficherDetails();
    }
}
