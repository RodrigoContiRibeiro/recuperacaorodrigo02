package com.example.rodrigocontiribeiro;

public class Professor extends Pessoal {
    private double salario;

    public Professor() {
    }

    public Professor(String nome, String telefone, String email, Endereco endereco, double salario) {
        super(nome, telefone, email, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                '}';
    }
}
