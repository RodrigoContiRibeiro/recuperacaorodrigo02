package com.example.rodrigocontiribeiro;

public class Aluno extends Pessoal {
    private String matricula;
    private double media;

    public Aluno() {
    }


    public Aluno(String nome, String telefone, String email, Endereco endereco, String matricula, double media) {
        super(nome, telefone, email, endereco);
        this.matricula = matricula;
        this.media = media;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcularMedia(double... args) {
        double soma = 0;
        for (double arg : args) {
            soma += arg;
        }
        double mediaCalculada = 0;
        if (soma != 0) {
            mediaCalculada = soma / args.length;
        }
        setMedia(mediaCalculada);
    }

    public String toString() {
        return "Aluno{" +
                super.toString() + '\'' +
                "matricula='" + matricula + '\'' +
                ", media='" + media + '\'' +
                '}';
    }
}
