public class Ingenieur extends Employe {
    private String specialite;

    // Constructeur avec paramètres
    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    // Redéfinition de la méthode calculerSalaire
    @Override
    public double calculerSalaire() {
        return salaire * 1.15;
    }

    // Redéfinition de la méthode afficherInformations
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Spécialité: " + specialite);
    }
}
