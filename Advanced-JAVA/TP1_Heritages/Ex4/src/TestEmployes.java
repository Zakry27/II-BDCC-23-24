public class TestEmployes {
    public static void main(String[] args) {
        // Déclaration et instanciation d'un ingénieur
        Ingenieur ingenieur = new Ingenieur("Dupont", "Alice", "alice.dupont@example.com", "0123456789", 3000.0, "Développement");

        // Déclaration et instanciation d'un manager
        Manager manager = new Manager("Martin", "Bob", "bob.martin@example.com", "0987654321", 5000.0, "Informatique");

        // Affichage des informations de l'ingénieur
        System.out.println("Informations de l'Ingénieur:");
        ingenieur.afficherInformations();

        // Affichage des informations du manager
        System.out.println("\nInformations du Manager:");
        manager.afficherInformations();
    }
}
