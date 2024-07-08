import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GestionEmployes {

    public static void main(String[] args) {
        List<Employe> employes = new ArrayList<>();
        employes.add(new Employe("Alice", "IT", 5000));
        employes.add(new Employe("Bob", "HR", 4500));
        employes.add(new Employe("Charlie", "Finance", 5500));
        employes.add(new Employe("David", "IT", 6000));
        employes.add(new Employe("Eve", "HR", 4000));

        // 1. Utiliser mapToDouble et sum pour calculer la somme totale des salaires de tous les employés.
        double totalSalaires = employes.stream()
                .mapToDouble(Employe::getSalaire)
                .sum();
        System.out.println("Somme totale des salaires: " + totalSalaires);

        // 2. Utiliser sorted pour trier la liste des employés par ordre alphabétique du nom.
        List<Employe> employesTries = employes.stream()
                .sorted(Comparator.comparing(Employe::getNom))
                .collect(Collectors.toList());
        System.out.println("Employés triés par nom: " + employesTries);

        // 3. Utiliser min pour trouver l'employé avec le salaire le plus bas.
        Optional<Employe> employeSalaireMin = employes.stream()
                .min(Comparator.comparingDouble(Employe::getSalaire));
        employeSalaireMin.ifPresent(employe -> System.out.println("Employé avec le salaire le plus bas: " + employe));

        // 4. Utiliser filter pour obtenir la liste des employés ayant un salaire supérieur à une valeur donnée.
        double valeurDonnee = 4500;
        List<Employe> employesSalaireSuperieur = employes.stream()
                .filter(employe -> employe.getSalaire() > valeurDonnee)
                .collect(Collectors.toList());
        System.out.println("Employés avec un salaire supérieur à " + valeurDonnee + ": " + employesSalaireSuperieur);

        // 5. Utiliser reduce pour trouver l'employé avec le salaire le plus élevé dans l'ensemble de l'entreprise.
        Optional<Employe> employeSalaireMax = employes.stream()
                .reduce((e1, e2) -> e1.getSalaire() > e2.getSalaire() ? e1 : e2);
        employeSalaireMax.ifPresent(employe -> System.out.println("Employé avec le salaire le plus élevé: " + employe));

        // 6. Utiliser reduce pour concaténer les noms de tous les employés.
        String nomsConcatene = employes.stream()
                .map(Employe::getNom)
                .reduce((nom1, nom2) -> nom1 + ", " + nom2)
                .orElse("");
        System.out.println("Noms concaténés de tous les employés: " + nomsConcatene);
    }
}
