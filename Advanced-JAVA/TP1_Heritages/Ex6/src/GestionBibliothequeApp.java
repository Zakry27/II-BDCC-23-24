public class GestionBibliothequeApp {
    public static void main(String[] args) {
        // Création d'instances de Livre
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        Livre livre2 = new Livre("1984", "George Orwell");

        // Création d'instances de DVD
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        DVD dvd2 = new DVD("The Matrix", "Wachowskis");

        // Création d'instances d'Utilisateur
        Utilisateur utilisateur1 = new Utilisateur("Alice");
        Utilisateur utilisateur2 = new Utilisateur("Bob");

        // Emprunter des objets
        utilisateur1.emprunterObjet(livre1);
        utilisateur1.emprunterObjet(dvd1);

        utilisateur2.emprunterObjet(livre1); // Livre déjà emprunté par Alice
        utilisateur2.emprunterObjet(dvd2);

        // Retourner des objets
        livre1.retourner();
        dvd1.retourner();

        // Emprunter à nouveau après retour
        utilisateur2.emprunterObjet(livre1);
    }
}
