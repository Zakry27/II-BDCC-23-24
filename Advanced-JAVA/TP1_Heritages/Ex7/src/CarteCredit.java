public class CarteCredit extends Paiement {
    private String numeroCarte;

    // Constructeur
    public CarteCredit(double montant, String numeroTransaction, String numeroCarte) {
        super(montant, numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    // Redéfinition de la méthode effectuerPaiement
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " unités par Carte de Crédit. Numéro de carte: " + numeroCarte);
    }
}
