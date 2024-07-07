public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean estEmprunte;

    // Constructeur avec paramètres
    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.estEmprunte = false;
    }

    // Implémentation de la méthode emprunter
    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println("Le DVD '" + titre + "' a été emprunté.");
        } else {
            System.out.println("Le DVD '" + titre + "' est déjà emprunté.");
        }
    }

    // Implémentation de la méthode retourner
    @Override
    public void retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println("Le DVD '" + titre + "' a été retourné.");
        } else {
            System.out.println("Le DVD '" + titre + "' n'était pas emprunté.");
        }
    }
}
