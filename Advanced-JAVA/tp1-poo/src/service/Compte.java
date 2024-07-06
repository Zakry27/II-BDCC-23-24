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

    public void retirer(double montant){
        if(montant<=solde){
            solde -= montant;
        }else {
            System.out.println("Le solde est insuffisant !!!");
        }
    }

    public void deposer(double montant){
        solde += montant;
    }

    public String toString(){
        return "{ Num : "+num+" NomClient : "+nomClient+" Solde : "+solde+"}";
    }
}
