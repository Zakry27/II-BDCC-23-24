public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected double salaire;

    // Constructeur sans paramètres
    public Employe() {
    }

    // Constructeur avec paramètres
    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    // Méthode abstraite pour calculer le salaire
    public abstract double calculerSalaire();

    // Méthode pour afficher les informations de base
    public void afficherInformations() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email +
                ", Téléphone: " + telephone + ", Salaire: " + calculerSalaire() + "€");
    }
}
