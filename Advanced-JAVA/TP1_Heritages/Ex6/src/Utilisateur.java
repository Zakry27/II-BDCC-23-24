public class Utilisateur {
    private String nom;

    // Constructeur avec paramètre
    public Utilisateur(String nom) {
        this.nom = nom;
    }

    // Méthode pour emprunter un objet
    public void emprunterObjet(Empruntable objet) {
        System.out.println(nom + " essaie d'emprunter un objet.");
        objet.emprunter();
    }
}
