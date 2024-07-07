public class NombreNegatifException extends Exception {
    private int valeurErronee;

    public NombreNegatifException(int valeurErronee) {
        super("Valeur négative non autorisée: " + valeurErronee);
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }
}
