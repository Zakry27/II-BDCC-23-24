package presentation;
import service.Compte;

public class GestionComptesApp {
    public static void main(String[] args) {
        Compte c1 = new Compte(1111, "Ahmed", 20000);
        Compte c2 = new Compte(2222, "Hajar", 30000);
        c1.retirer(19000);
        c2.retirer(45000);
        c1.deposer(15000);

        System.out.println(c1.getNum() + " " + c1.getNomClient() + " " + c1.getSolde());
        c1.setSolde(-2000);
        System.out.println(c1.toString());
    }
}
