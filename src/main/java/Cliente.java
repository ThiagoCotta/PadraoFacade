import java.text.Normalizer;

public class Cliente {

    public boolean liberarEmprestimo() {
        return ClienteFacade.verificarPendenciasEmprestimo(this);
    }
}
