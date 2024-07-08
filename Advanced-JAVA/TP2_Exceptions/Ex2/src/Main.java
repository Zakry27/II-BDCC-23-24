import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        // Ajout de comptes
        CompteCourant cc1 = new CompteCourant("CC001", 1000, "Alice", 500);
        CompteEpargne ce1 = new CompteEpargne("CE001", 2000, "Bob", 0.05);

        comptes.add(cc1);
        comptes.add(ce1);

        // Affichage des soldes initiaux
        cc1.afficherSolde();
        ce1.afficherSolde();

        try {
            // Dépôt d'argent
            cc1.deposer(200);
            ce1.deposer(300);

            // Retrait d'argent
            cc1.retirer(1500); // Autorisé avec le découvert
            ce1.retirer(2500); // Devrait lever une exception

            // Transfert d'argent
            cc1.transfererArgent(ce1, 300);

            // Génération d'intérêts sur le compte épargne
            ce1.genererInteret();

        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.err.println("Erreur: " + e.getMessage());
        }

        // Affichage des soldes finaux
        cc1.afficherSolde();
        ce1.afficherSolde();
    }
}
