package br.com.silvany.desafio;

import static org.junit.Assert.*;

import org.junit.Test;

public class desafioDoisTest {
    //TODO adicionar mais testes
    @Test
    public void desafioCerto() {
        DesafioDois a = new DesafioDois();
        assertEquals(0, a.desafio("aA1!as"));
    }

    @Test
    public void desafioCertoSegundo() {
        DesafioDois a = new DesafioDois();
        assertEquals(3, a.desafio("Ya3"));
    }

    @Test
    public void desafioErrado() {
        DesafioDois a = new DesafioDois();
        assertNotEquals(0, a.desafio("aA1!a"));
    }
}