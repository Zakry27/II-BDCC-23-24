public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, double solde, String nomTitulaire, double tauxInteret) {
        super(numeroCompte, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void genererInteret() {
        double interet = solde * tauxInteret;
        solde += interet;
        System.out.println("Génération d'intérêts de " + interet + " sur le compte épargne " + getNumeroCompte());
    }
}
