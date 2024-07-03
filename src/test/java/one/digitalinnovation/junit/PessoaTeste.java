package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa samia = new Pessoa("Sâmia", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(24, samia.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa samia = new Pessoa("Sâmia", LocalDateTime.of(2017, 1, 1, 15, 0, 0));
        Pessoa paulo = new Pessoa("Sâmia", LocalDateTime.of(2000, 1, 1, 15, 0, 0));

        Assertions.assertFalse(samia.ehMaiorDeIdade());
        Assertions.assertTrue(paulo.ehMaiorDeIdade());
    }
}
