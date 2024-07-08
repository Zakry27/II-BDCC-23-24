public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde + decouvertAutorise) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour le retrait, même avec le découvert.");
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " du compte courant " + getNumeroCompte());
    }
}
