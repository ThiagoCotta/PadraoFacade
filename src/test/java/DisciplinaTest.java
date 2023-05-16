import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaCreditoLiberarEmprestimo() {
        Cliente cliente = new Cliente();
        Credito.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.liberarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaEmpregoLiberarEmprestimo() {
        Cliente cliente = new Cliente();
        Emprego.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.liberarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaRendaLiberarEmprestimo() {
        Cliente cliente = new Cliente();
        Renda.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.liberarEmprestimo());
    }

    @Test
    void deveRetornarClienteSemPendenciaEmprestimo() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.liberarEmprestimo());
    }

}