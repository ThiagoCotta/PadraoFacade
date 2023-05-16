public class Emprego extends Analise {

    private static Emprego emprego = new Emprego();

    private Emprego() {};

    public static Emprego getInstancia() {
        return emprego;
    }
}
