public class BibliothequeApp {
    public static void main(String[] args) {
        // Déclaration et instanciation d'un adhérent
        Adherent adherent = new Adherent("Dupont", "Jean", "jean.dupont@example.com", "0123456789", 30, "AD001");

        // Déclaration et instanciation d'un auteur
        Auteur auteur = new Auteur("Hugo", "Victor", "victor.hugo@example.com", "0987654321", 46, "AU001");

        // Déclaration et instanciation d'un livre
        Livre livre = new Livre(123456, "Les Misérables", auteur);

        // Affichage des informations de l'adhérent et du livre
        System.out.println(adherent);
        System.out.println(livre);
    }
}
