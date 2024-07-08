import java.util.concurrent.Callable;

public class Sommeur implements Callable<Integer> {
    private int[] tableau;
    private int debut;
    private int fin;
    private int somme;

    public Sommeur(int[] tableau, int debut, int fin) {
        this.tableau = tableau;
        this.debut = debut;
        this.fin = fin;
        this.somme = 0;
    }

    @Override
    public Integer call() {
        for (int i = debut; i < fin; i++) {
            somme += tableau[i];
        }
        return somme;
    }
}
