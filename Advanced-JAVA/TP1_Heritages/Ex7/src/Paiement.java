public class Paiement {
    protected double montant;
    protected String numeroTransaction;

    // Constructeur
    public Paiement(double montant, String numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    // Méthode pour effectuer le paiement
    public void effectuerPaiement(double montant) {
        System.out.println("Effectuer paiement de " + montant + " unités.");
    }
}
