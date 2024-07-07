public class TestEntierNaturel {
    public static void main(String[] args) {
        try {
            // Création d'un entier naturel avec une valeur positive
            EntierNaturel entier = new EntierNaturel(10);
            System.out.println("Valeur initiale: " + entier.getVal());

            // Décrémente la valeur
            entier.decrementer();
            System.out.println("Après décrémentation: " + entier.getVal());

            // Modifie la valeur avec une valeur positive
            entier.setVal(5);
            System.out.println("Après modification: " + entier.getVal());

            // Tentative de décrémentation jusqu'à atteindre une valeur négative
            while (true) {
                entier.decrementer();
                System.out.println("Après décrémentation: " + entier.getVal());
            }
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée: " + e.getMessage());
            System.err.println("Valeur erronée: " + e.getValeurErronee());
        }

        try {
            // Tentative de création d'un entier naturel avec une valeur négative
            EntierNaturel entierNegatif = new EntierNaturel(-5);
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée: " + e.getMessage());
            System.err.println("Valeur erronée: " + e.getValeurErronee());
        }

        try {
            // Création d'un entier naturel avec une valeur positive
            EntierNaturel entier = new EntierNaturel(2);
            // Tentative de définir une valeur négative
            entier.setVal(-3);
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée: " + e.getMessage());
            System.err.println("Valeur erronée: " + e.getValeurErronee());
        }
    }
}
