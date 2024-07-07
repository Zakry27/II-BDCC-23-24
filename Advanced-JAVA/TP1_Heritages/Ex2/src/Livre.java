public class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;

    // Constructeur avec paramètres
    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Titre: " + titre + ", Auteur: [" + auteur.toString() + "]";
    }
}
