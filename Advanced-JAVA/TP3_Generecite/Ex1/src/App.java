public class App {
    public static void main(String[] args) {
        // Tester StorageGenerique avec des entiers
        StorageGenerique<Integer> intStorage = new StorageGenerique<>();
        intStorage.addElement(1);
        intStorage.addElement(2);
        intStorage.addElement(3);

        System.out.println("Taille de intStorage: " + intStorage.getSize());
        System.out.println("Élément à l'index 1 de intStorage: " + intStorage.getElement(1));

        intStorage.removeElement(1);
        System.out.println("Taille de intStorage après suppression: " + intStorage.getSize());

        // Tester StorageGenerique avec des chaînes de caractères
        StorageGenerique<String> stringStorage = new StorageGenerique<>();
        stringStorage.addElement("Bonjour");
        stringStorage.addElement("le");
        stringStorage.addElement("monde");

        System.out.println("Taille de stringStorage: " + stringStorage.getSize());
        System.out.println("Élément à l'index 2 de stringStorage: " + stringStorage.getElement(2));

        stringStorage.removeElement(0);
        System.out.println("Taille de stringStorage après suppression: " + stringStorage.getSize());

        // Tester StorageGenerique avec des doubles
        StorageGenerique<Double> doubleStorage = new StorageGenerique<>();
        doubleStorage.addElement(1.1);
        doubleStorage.addElement(2.2);
        doubleStorage.addElement(3.3);

        System.out.println("Taille de doubleStorage: " + doubleStorage.getSize());
        System.out.println("Élément à l'index 0 de doubleStorage: " + doubleStorage.getElement(0));

        doubleStorage.removeElement(2);
        System.out.println("Taille de doubleStorage après suppression: " + doubleStorage.getSize());
    }
}
