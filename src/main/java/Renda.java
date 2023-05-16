import java.util.ArrayList;

public class Renda extends Analise {

    private static Renda renda = new Renda();

    private Renda() {};

    public static Renda getInstancia() {
        return renda;
    }
}
