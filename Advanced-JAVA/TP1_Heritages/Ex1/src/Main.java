public class Main {
    public static void main(String[] args){
        // Création d'un compte bancaire
        Compte compte1 = new Compte();
        compte1.setNumero("123456");

        // Affichage des informations initiales du compte
        compte1.afficherCompteInfo();

        // Dépôt d'un montant
        compte1.deposer(500.0);
        compte1.afficherCompteInfo();

        // Retrait d'un montant
        compte1.retirer(200.0);
        compte1.afficherCompteInfo();

        // Tentative de retrait d'un montant supérieur au solde
        compte1.retirer(400.0);
        compte1.afficherCompteInfo();

        // Affichage du nombre de comptes créés
        Compte.afficherNbComptes();
    }
}
