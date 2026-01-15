package service;

import exception.FilaVaziaException;
import model.Atendimento;
import model.AtendimentosRealizados;
import model.Paciente;

import java.security.PublicKey;
import java.util.List;


public class Atender implements Atendimento {
    FilaPrioridade filaAtendimento ;
    AtendimentosRealizados atendimentos;

    public Atender(){
        this.atendimentos = new AtendimentosRealizados();
    }

    @Override
    public void atenderPaciente(FilaPrioridade filaAtendimento) throws FilaVaziaException{
        Paciente paciente = filaAtendimento.removerPacienteDaFila();

        atendimentos.adicionarListaAtendimentosRealizados(paciente);
        System.out.println("Paciente em atendimento: ");
        paciente.exibirDados();
    }

    public List<Paciente> getPacientesAtendidos(){
        return atendimentos.getPacientesAtendidos();
    }


}
