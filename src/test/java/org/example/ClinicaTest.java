package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClinicaTest {


    Clinica clinica;
    Tratamento tratamento;

    @BeforeEach
    void setUp() {
        clinica = new Clinica();
        tratamento = new Tratamento("Dentario");
    }

    @Test
    void deveAbrirTratamento() {
        Tarefa aberturaTratamento = new AberturaTratamentoTarefa(tratamento);
        clinica.executarTarefa(aberturaTratamento);

        assertEquals("Tratamento iniciado", tratamento.getSituacao());
    }

    @Test
    void deveFecharTratamento() {
        Tarefa fechamentoTratamento = new FechamentoTratamentoTarefa(tratamento);
        clinica.executarTarefa(fechamentoTratamento);

        assertEquals("Tratamento fechado", tratamento.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa aberturaTratamento = new AberturaTratamentoTarefa(tratamento);
        Tarefa fechamentoTratamento = new FechamentoTratamentoTarefa(tratamento);

        clinica.executarTarefa(aberturaTratamento);
        clinica.executarTarefa(fechamentoTratamento);

        clinica.cancelarUltimaTarefa();

        assertEquals("Tratamento iniciado", tratamento.getSituacao());
    }
}