package service;
// importations

public class Compte {

    private long num;
    private String nomClient;
    private double solde;

    public Compte(){

    }

    public Compte(long num, String nomClient, double solde){
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    // getter for num
    public long getNum() {
        return num;
    }
    // setter for num
    public void setNum(long num) {
        this.num = num;
    }
    // getter for nomClient
    public String getNomClient() {
        return nomClient;
    }
    // setter for nomClient
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    // getter for solde
    public double getSolde() {
        return solde;
    }
    // setter for solde
    public void setSolde(double solde) {
        if (solde >= 0)
            this.solde =  solde;
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + num);
        System.out.println("Nom du client : " + nomClient);
        System.out.println("Solde du compte : " + solde);
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Le montant du dépôt doit être supérieur à zéro.");
        }
    }
}
