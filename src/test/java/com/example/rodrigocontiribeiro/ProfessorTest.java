package com.example.rodrigocontiribeiro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    private Endereco endereco = new Endereco("Rua", "Cidade", "UF", "12313-140", "Brasil");

    private Professor professor = new Professor("Paulete", "99999999", "paulinho@gmai.com", endereco, 9999.9);

    @Test
    void getSalario() {
        assertEquals(9999.9, professor.getSalario());
    }

    @Test
    void setSalario() {
        professor.setSalario(10000);
        assertEquals(10000, professor.getSalario());
    }
}