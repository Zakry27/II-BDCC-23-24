import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit par indice");
            System.out.println("3. Afficher la liste des produits");
            System.out.println("4. Modifier un produit par indice");
            System.out.println("5. Rechercher un produit par nom");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'id du produit: ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // consommer la nouvelle ligne

                    System.out.print("Entrez le nom du produit: ");
                    String nom = scanner.nextLine();

                    System.out.print("Entrez le prix du produit: ");
                    double prix = scanner.nextDouble();

                    Produit produit = new Produit(id, nom, prix);
                    produits.add(produit);
                    System.out.println("Produit ajouté.");
                    break;
                case 2:
                    System.out.print("Entrez l'indice du produit à supprimer: ");
                    int indexSuppression = scanner.nextInt();
                    if (indexSuppression >= 0 && indexSuppression < produits.size()) {
                        produits.remove(indexSuppression);
                        System.out.println("Produit supprimé.");
                    } else {
                        System.out.println("Indice invalide.");
                    }
                    break;
                case 3:
                    System.out.println("Liste des produits:");
                    for (Produit p : produits) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    System.out.print("Entrez l'indice du produit à modifier: ");
                    int indexModification = scanner.nextInt();
                    if (indexModification >= 0 && indexModification < produits.size()) {
                        scanner.nextLine(); // consommer la nouvelle ligne

                        System.out.print("Entrez le nouveau nom du produit: ");
                        String nouveauNom = scanner.nextLine();

                        System.out.print("Entrez le nouveau prix du produit: ");
                        double nouveauPrix = scanner.nextDouble();

                        Produit produitAModifier = produits.get(indexModification);
                        produitAModifier.setNom(nouveauNom);
                        produitAModifier.setPrix(nouveauPrix);
                        System.out.println("Produit modifié.");
                    } else {
                        System.out.println("Indice invalide.");
                    }
                    break;
                case 5:
                    System.out.print("Entrez le nom du produit à rechercher: ");
                    String nomRecherche = scanner.nextLine();
                    boolean found = false;
                    for (Produit p : produits) {
                        if (p.getNom().equalsIgnoreCase(nomRecherche)) {
                            System.out.println(p);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Produit non trouvé.");
                    }
                    break;
                case 6:
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
