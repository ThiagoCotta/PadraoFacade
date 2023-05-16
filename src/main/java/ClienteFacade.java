public class ClienteFacade {

    public static boolean verificarPendenciasEmprestimo(Cliente cliente) {
        if (Emprego.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Renda.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Credito.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
