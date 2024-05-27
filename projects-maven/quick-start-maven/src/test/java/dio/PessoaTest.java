package dio;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    void deveCalcularIdadeCorreto() {
        Pessoa pessoa1 = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 7, 0, 0));

        Assertions.assertEquals(22, pessoa1.getIdade());

    }

    @Test
    void deveRetornarMaiorIdade() {
        Pessoa pessoa2 = new Pessoa("Danilo", LocalDateTime.of(2000, 2, 2, 15, 30, 30));

        Assertions.assertTrue(pessoa2.ehMaiordeIdade());
    }
}
