public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean estEmprunte;

    // Constructeur avec paramètres
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estEmprunte = false;
    }

    // Implémentation de la méthode emprunter
    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println("Le livre '" + titre + "' a été emprunté.");
        } else {
            System.out.println("Le livre '" + titre + "' est déjà emprunté.");
        }
    }

    // Implémentation de la méthode retourner
    @Override
    public void retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println("Le livre '" + titre + "' a été retourné.");
        } else {
            System.out.println("Le livre '" + titre + "' n'était pas emprunté.");
        }
    }
}
