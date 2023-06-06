package org.example;

public class AberturaTratamentoTarefa implements Tarefa {

    private Tratamento tratamento;

    public AberturaTratamentoTarefa(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public void executar() {
        this.tratamento.abrirTratamento();
    }

    public void cancelar() {
        this.tratamento.fecharTratamento();
    }
}
