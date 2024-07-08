public class CompteBancaire {
    private String numeroCompte;
    protected double solde;
    private String nomTitulaire;

    public CompteBancaire(String numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " sur le compte " + numeroCompte);
        } else {
            System.out.println("Le montant de dépôt doit être positif.");
        }
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour le retrait.");
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " du compte " + numeroCompte);
    }

    public double getSolde() {
        return solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + numeroCompte + " : " + solde);
    }

    public void transfererArgent(CompteBancaire autreCompte, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (autreCompte == null) {
            throw new CompteInexistantException("Le compte de destination n'existe pas.");
        }
        this.retirer(montant);
        autreCompte.deposer(montant);
        System.out.println("Transfert de " + montant + " du compte " + this.numeroCompte + " au compte " + autreCompte.getNumeroCompte());
    }
}
