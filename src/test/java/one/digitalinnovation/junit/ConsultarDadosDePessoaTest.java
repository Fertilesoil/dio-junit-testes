package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configurar conexão");
    }

    @BeforeEach
    void inserirDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("Flávia", LocalDateTime.of(1987, 3, 1, 13, 27, 21)));
    }

    @AfterEach
    void removerDadosDeTeste() {
        BancoDeDados.removerDados(new Pessoa("Flávia", LocalDateTime.of(1987, 3, 1, 13, 27, 21)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizar conexão");
    }
}
