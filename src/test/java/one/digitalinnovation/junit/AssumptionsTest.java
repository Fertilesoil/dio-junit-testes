package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteEmUmUsuario() {
        Assumptions.assumeTrue("Fernando".equals(System.getenv("USER")));
        Assertions.assertEquals(5 + 5,  10);
    }
}
