import java.util.HashSet;
import java.util.Set;

public class GestionGroupesEtudiantsApp {

    public static void main(String[] args) {
        // 1. Créer deux Sets de type HashSet nommées groupeA et groupeB
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // 2. Ajouter des noms des étudiants à chaque HashSet
        groupeA.add("Alice");
        groupeA.add("Bob");
        groupeA.add("Charlie");
        groupeA.add("David");

        groupeB.add("Eve");
        groupeB.add("Frank");
        groupeB.add("Charlie");
        groupeB.add("Bob");

        // Afficher les étudiants de chaque groupe
        System.out.println("Étudiants dans le groupe A: " + groupeA);
        System.out.println("Étudiants dans le groupe B: " + groupeB);

        // 3. Afficher l’intersection des deux HashSets
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des groupes A et B: " + intersection);

        // 4. Afficher l’union des deux HashSets
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des groupes A et B: " + union);
    }
}
