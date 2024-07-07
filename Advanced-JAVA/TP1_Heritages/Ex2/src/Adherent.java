public class Adherent extends Personne{
    private String numAdherent;

    // Constructeur avec paramètres
    public Adherent(String nom, String prenom, String email, String tel, int age, String numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return super.toString() + ", Numéro d'adhérent: " + numAdherent;
    }
}
