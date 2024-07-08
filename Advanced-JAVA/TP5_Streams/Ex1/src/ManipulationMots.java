import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ManipulationMots {

    public static void main(String[] args) {
        List<String> mots = Arrays.asList("apple", "banana", "pear", "kiwi", "grape", "melon", "date");

        // 1. Filtrer les mots qui contiennent la lettre "a"
        List<String> contientA = mots.stream()
                .filter(mot -> mot.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Mots contenant la lettre 'a': " + contientA);

        // 2. Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse
        List<String> longueurSuperieureA3Inverse = mots.stream()
                .filter(mot -> mot.length() > 3)
                .map(mot -> new StringBuilder(mot).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Mots de longueur supérieure à 3 inversés: " + longueurSuperieureA3Inverse);

        // 3. Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères
        List<Character> contientEDecompose = mots.stream()
                .filter(mot -> mot.contains("e"))
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Caractères des mots contenant la lettre 'e': " + contientEDecompose);

        // 4. Transformer chaque chaîne en sa version en majuscules
        List<String> enMajuscules = mots.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mots en majuscules: " + enMajuscules);

        // 5. Convertir chaque chaîne en sa longueur
        List<Integer> longueurs = mots.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Longueur de chaque mot: " + longueurs);

        // 6. Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères
        List<Character> caracteresAplatis = mots.stream()
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Liste de tous les caractères: " + caracteresAplatis);

        // 7. Transformer chaque nom en une chaîne de la forme "Nom - Index"
        List<String> nomAvecIndex = mots.stream()
                .map(mot -> mot + " - " + mots.indexOf(mot))
                .collect(Collectors.toList());
        System.out.println("Nom avec index: " + nomAvecIndex);
    }
}
