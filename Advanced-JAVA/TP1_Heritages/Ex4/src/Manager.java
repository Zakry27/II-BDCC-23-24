public class Manager extends Employe {
    private String service;

    // Constructeur avec paramètres
    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    // Redéfinition de la méthode calculerSalaire
    @Override
    public double calculerSalaire() {
        return salaire * 1.20;
    }

    // Redéfinition de la méthode afficherInformations
    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Service: " + service);
    }
}
