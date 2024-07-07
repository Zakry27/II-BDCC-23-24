public class Auteur extends Personne{
    private String numAuteur;

    // Constructeur avec paramètres
    public Auteur(String nom, String prenom, String email, String tel, int age, String numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return super.toString() + ", Numéro d'auteur: " + numAuteur;
    }
}
