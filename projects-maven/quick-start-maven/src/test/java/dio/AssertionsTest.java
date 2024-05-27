package dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    
    @Test
    void validarLancamentos() {
        
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5, 2, 3, 10};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
    }

    @Test
    void validarNumerosTipoDiferente() {
        
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }
}
