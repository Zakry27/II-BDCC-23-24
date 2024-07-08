import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");
            System.out.print("Choisissez une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // consommer la ligne restante

            switch (choix) {
                case 1:
                    List<Produit> produits = metier.getAll();
                    if (produits.isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        for (Produit produit : produits) {
                            System.out.println(produit);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Entrez l'id du produit: ");
                    long idRecherche = scanner.nextLong();
                    Produit produitTrouve = metier.findById(idRecherche);
                    if (produitTrouve != null) {
                        System.out.println(produitTrouve);
                    } else {
                        System.out.println("Produit introuvable.");
                    }
                    break;
                case 3:
                    System.out.print("Entrez l'id du produit: ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // consommer la ligne restante

                    System.out.print("Entrez le nom du produit: ");
                    String nom = scanner.nextLine();

                    System.out.print("Entrez la marque du produit: ");
                    String marque = scanner.nextLine();

                    System.out.print("Entrez le prix du produit: ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); // consommer la ligne restante

                    System.out.print("Entrez la description du produit: ");
                    String description = scanner.nextLine();

                    System.out.print("Entrez le nombre en stock: ");
                    int nombreEnStock = scanner.nextInt();

                    Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
                    metier.add(nouveauProduit);
                    System.out.println("Produit ajouté avec succès.");
                    break;
                case 4:
                    System.out.print("Entrez l'id du produit à supprimer: ");
                    long idSupprimer = scanner.nextLong();
                    metier.delete(idSupprimer);
                    System.out.println("Produit supprimé avec succès.");
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
                    break;
            }
        }
    }
}
