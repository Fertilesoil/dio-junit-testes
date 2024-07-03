package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTest {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 20, 12, 11, -5};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        Pessoa pessoa1 = new Pessoa("Valdo", LocalDateTime.now());
        Assertions.assertNotNull(pessoa1);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0d;
        double outroValor = 5.0d;

        Assertions.assertEquals(valor, outroValor);
    }
}
