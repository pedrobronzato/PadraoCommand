package org.example;

public class Tratamento {

    private String tipo;
    private String situacao;

    public Tratamento(String tipo) {
        this.tipo = tipo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirTratamento() {
        this.situacao = "Tratamento iniciado";
    }

    public void fecharTratamento() {
        this.situacao = "Tratamento fechado";
    }
}
