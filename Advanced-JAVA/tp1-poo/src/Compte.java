public class Compte {
    long num;
    String nomClient;
    double solde;
    public Compte(){

    }
    public Compte(long num, String nomClient, double solde){
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }
    void retirer(double montant){
        if(montant<=solde){
            solde -= montant;
        }else {
            System.out.println("Le solde est insuffisant !!!");
        }
    }
    void deposer(double montant){
        solde += montant;
    }
}
