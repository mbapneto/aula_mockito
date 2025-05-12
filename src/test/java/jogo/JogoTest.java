package jogo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JogoTest {

    private Jogador jogador;
    private Dado dado1;
    private Dado dado2;
    private Jogo jogo;

    @BeforeEach
    public void setup() {
        jogador = mock (Jogador.class)
        dado1 = mock(Dado.class);
        dado2 = mock(Dado.class);
        jogo = new Jogo();
    }

    @Test
    public void testLancarSomaDosDados() {
        when(dado1.numero()).thenReturn(3);
        when(dado2.numero()).thenReturn(4);
               
        assertEquals(true, jogo.jogo(jogador, dado1,dado2));
    }

    @Test
    public boolean  testLancarSomaDosDados() {
        when(dado1.numero()).thenReturn(1);
        when(dado2.numero()).thenReturn(1);

       

        assertEquals(false, jogo.jogo(jogador, dado1,dado2));
    }

    @Test
    public void testLancarComDadosDiferentes() {
        when(dado1.numero()).thenReturn(7);
        when(dado2.numero()).thenReturn(1);

        assertThrows(Exceptions.class, jogo.jogo(jogador, dado1,dado2));
    }
}
