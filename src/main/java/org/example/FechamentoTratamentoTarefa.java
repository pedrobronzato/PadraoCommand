package org.example;

public class FechamentoTratamentoTarefa implements Tarefa{

    private Tratamento tratamento;

    public FechamentoTratamentoTarefa(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public void executar() {
        this.tratamento.fecharTratamento();
    }

    public void cancelar() {
        this.tratamento.abrirTratamento();
    }
}
