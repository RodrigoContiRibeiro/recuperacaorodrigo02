package com.example.rodrigocontiribeiro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoalTest {
    private Endereco endereco = new Endereco("Rua", "Cidade", "UF", "12313-140", "Brasil");

    private Pessoal pessoal = new Pessoal("Rodrigo", "13221313123", "rodrigo@gmai.com.br", endereco);

    @Test
    void getNome() {
        assertEquals("Rodrigo", pessoal.getNome());
    }

    @Test
    void setNome() {
        pessoal.setNome("Claudio");
        assertEquals("Claudio", pessoal.getNome());
    }

    @Test
    void getTelefone() {
        assertEquals("13221313123", pessoal.getTelefone());
    }

    @Test
    void setTelefone() {
        pessoal.setTelefone("999999999");
        assertEquals("999999999", pessoal.getTelefone());
    }

    @Test
    void getEmail() {
        assertEquals("rodrigo@gmai.com.br", pessoal.getEmail());
    }

    @Test
    void setEmail() {
        pessoal.setEmail("claudio@gmail.com");
        assertEquals("claudio@gmail.com", pessoal.getEmail());
    }


    @Test
    void getEndereco() {
        assertEquals(endereco, pessoal.getEndereco());
    }

    @Test
    void setEndereco() {
        Endereco endereco2 = new Endereco("Rua2", "Cidade2", "UF2", "12313-1402", "Brasil2");
        pessoal.setEndereco(endereco2);
        assertEquals(endereco2, pessoal.getEndereco());
    }

}