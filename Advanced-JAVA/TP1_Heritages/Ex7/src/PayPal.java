public class PayPal extends Paiement {
    private String adresseEmail;

    // Constructeur
    public PayPal(double montant, String numeroTransaction, String adresseEmail) {
        super(montant, numeroTransaction);
        this.adresseEmail = adresseEmail;
    }

    // Redéfinition de la méthode effectuerPaiement
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " unités par PayPal. Adresse email: " + adresseEmail);
    }
}
