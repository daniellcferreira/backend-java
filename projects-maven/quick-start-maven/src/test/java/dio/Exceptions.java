package dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exceptions {

    @Test
    void validarCenarioExcecaoTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456789", 100);

        Transferencia transferencia = new Transferencia();

        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            transferencia.transfere(contaOrigem, contaDestino, -1)
        );
    }
}    
