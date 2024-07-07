public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes = 0;

    // Constructeur sans paramètres
    public Compte() {
        this.numero = "";
        this.solde = 0.0;
        nbComptes++;
    }

    // Getters et Setters pour numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getters et Setters pour solde
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Méthode deposer
    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
        } else {
            System.out.println("Le montant à déposer doit être positif.");
        }
    }

    // Méthode retirer
    public void retirer(double montant) {
        if (montant > 0 && this.solde >= montant) {
            this.solde -= montant;
        } else if (montant <= 0) {
            System.out.println("Le montant à retirer doit être positif.");
        } else {
            System.out.println("Solde insuffisant pour effectuer cette opération.");
        }
    }

    // Méthode afficherCompteInfo
    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + this.numero);
        System.out.println("Solde actuel : " + this.solde + "€");
    }

    // Méthode statique afficherNbComptes
    public static void afficherNbComptes() {
        System.out.println("Nombre de comptes créés : " + nbComptes);
    }
}
