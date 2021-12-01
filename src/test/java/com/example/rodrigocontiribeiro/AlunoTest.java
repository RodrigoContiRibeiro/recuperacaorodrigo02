package com.example.rodrigocontiribeiro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    private Endereco endereco = new Endereco("Rua", "Cidade", "UF", "12313-140", "Brasil");

    private Aluno aluno = new Aluno("Rodrigo", "13221313123", "rodrigo@gmai.com.br", endereco, "111111", 10.50);

    @Test
    void getMatricula() {
        assertEquals("111111", aluno.getMatricula());
    }

    @Test
    void setMatricula() {
        aluno.setMatricula("222222");
        assertEquals("222222", aluno.getMatricula());
    }

    @Test
    void getMedia() {
        assertEquals(10.50, aluno.getMedia());
    }

    @Test
    void setMedia() {
        aluno.setMedia(9);
        assertEquals(9, aluno.getMedia());
    }

    @Test
    void calcularMedia() {
        aluno.calcularMedia(1.5, 2.7, 7.6, 10, 0.5);
        assertEquals(4.46, aluno.getMedia());
    }


}