public class GestionPaiementApp {
    public static void main(String[] args) {
        // Création d'instances de moyens de paiement
        CarteCredit carteCredit = new CarteCredit(150.0, "TRX12345", "1234-5678-9876-5432");
        PayPal payPal = new PayPal(200.0, "TRX67890", "utilisateur@example.com");

        // Création d'instances de commandes
        Commande commande1 = new Commande(150.0, carteCredit);
        Commande commande2 = new Commande(200.0, payPal);

        // Traitement des paiements
        System.out.println("Traitement de la commande 1:");
        commande1.processPayment();

        System.out.println("\nTraitement de la commande 2:");
        commande2.processPayment();
    }
}
