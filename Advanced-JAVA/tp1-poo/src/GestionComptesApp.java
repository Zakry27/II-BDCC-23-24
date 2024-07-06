public class GestionComptesApp {
    public static void main(String[] args) {
        Compte c1 = new Compte(1111, "Ahmed", 20000);
        Compte c2 = new Compte(2222, "Hajar", 30000);
        c1.retirer(19000);
        c2.retirer(45000);
        c1.deposer(15000);

        System.out.println(c1.num + " " + c1.nomClient + " " + c1.solde);
        System.out.println(c2.num + " " + c2.nomClient + " " + c2.solde);
    }
}
