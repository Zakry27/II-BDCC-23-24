import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class GestionNotesEtudiantsApp {

    public static void main(String[] args) {
        // Créez un HashMap pour stocker les notes des étudiants
        Map<String, Double> notesEtudiants = new HashMap<>();

        // 2. Insérer des notes des étudiants
        notesEtudiants.put("Alice", 15.0);
        notesEtudiants.put("Bob", 18.5);
        notesEtudiants.put("Charlie", 12.0);
        notesEtudiants.put("David", 14.5);

        // Afficher la liste après insertion
        System.out.println("Notes des étudiants après insertion :");
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println();

        // 3. Augmenter la note d'un étudiant
        augmenterNote(notesEtudiants, "Alice", 1.0);

        // 4. Supprimer la note d'un étudiant
        supprimerNote(notesEtudiants, "Charlie");

        // 5. Afficher la taille du map
        System.out.println("Taille du map : " + notesEtudiants.size());

        // 6. Afficher la note moyenne, max et min
        afficherStatistiques(notesEtudiants);

        // 7. Vérifier s'il y a une note égale à 20
        verifierNoteEgaleA20(notesEtudiants);

        // Afficher la liste après toutes les opérations
        System.out.println("Notes des étudiants après toutes les opérations :");
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + " : " + note));
    }

    private static void augmenterNote(Map<String, Double> notesEtudiants, String nom, double augmentation) {
        notesEtudiants.computeIfPresent(nom, (k, v) -> v + augmentation);
        System.out.println("Note de " + nom + " après augmentation : " + notesEtudiants.get(nom));
        System.out.println();
    }

    private static void supprimerNote(Map<String, Double> notesEtudiants, String nom) {
        notesEtudiants.remove(nom);
        System.out.println("Note de " + nom + " supprimée.");
        System.out.println();
    }

    private static void afficherStatistiques(Map<String, Double> notesEtudiants) {
        if (notesEtudiants.isEmpty()) {
            System.out.println("Aucune note disponible pour calculer les statistiques.");
            return;
        }

        OptionalDouble moyenne = notesEtudiants.values().stream().mapToDouble(Double::doubleValue).average();
        double max = notesEtudiants.values().stream().mapToDouble(Double::doubleValue).max().orElse(Double.NaN);
        double min = notesEtudiants.values().stream().mapToDouble(Double::doubleValue).min().orElse(Double.NaN);

        System.out.println("Statistiques des notes :");
        moyenne.ifPresent(m -> System.out.println("Moyenne : " + m));
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println();
    }

    private static void verifierNoteEgaleA20(Map<String, Double> notesEtudiants) {
        boolean noteEgaleA20 = notesEtudiants.containsValue(20.0);
        if (noteEgaleA20) {
            System.out.println("Il y a au moins une note égale à 20.");
        } else {
            System.out.println("Il n'y a aucune note égale à 20.");
        }
        System.out.println();
    }
}
