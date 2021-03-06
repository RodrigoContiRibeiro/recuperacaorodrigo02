package com.example.rodrigocontiribeiro;

public class Endereco {
    private String rua;
    private String cidade;
    private String uf;
    private String cep;
    private String pais;

    public Endereco() {
    }

    public Endereco(String rua, String cidade, String uf, String cep, String pais) {
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                super.toString() + '\'' +
                "rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
