package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validarCenarioDeExceçãoTransferencia() {
        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferencia.transfere(-20));
        Assertions.assertDoesNotThrow(() -> transferencia.transfere(20));
    }
}
