public class Credito extends Analise {

    private static Credito credito = new Credito();

    private Credito() {};

    public static Credito getInstancia() {
        return credito;
    }

}
