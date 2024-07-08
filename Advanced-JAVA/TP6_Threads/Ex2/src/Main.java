import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Exemple de tableau d'entiers
        int taille = tableau.length;
        int nbThreads = 4; // Nombre de threads souhaité
        int plage = taille / nbThreads;

        ExecutorService executor = Executors.newFixedThreadPool(nbThreads);
        List<Future<Integer>> results = new ArrayList<>();

        // Diviser le tableau en plusieurs plages et soumettre les tâches au pool de threads
        for (int i = 0; i < nbThreads; i++) {
            int debut = i * plage;
            int fin = (i == nbThreads - 1) ? taille : (i + 1) * plage;
            Sommeur sommeur = new Sommeur(tableau, debut, fin);
            Future<Integer> result = executor.submit(sommeur);
            results.add(result);
        }

        // Attendre que tous les threads aient terminé et calculer la somme totale
        int sommeTotale = 0;
        for (Future<Integer> future : results) {
            try {
                sommeTotale += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Afficher la somme totale
        System.out.println("Somme totale du tableau : " + sommeTotale);

        // Fermer l'executor
        executor.shutdown();
    }
}
