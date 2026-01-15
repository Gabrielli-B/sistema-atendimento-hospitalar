package service;

import exception.FilaVaziaException;
import model.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaPrioridade {

    private Queue<Paciente> pacientes;

    public FilaPrioridade(){
        this.pacientes = new PriorityQueue<>(
                Comparator.comparingInt(
                        p -> p.getTipoAtendimento().getPrioridade()
                )
        );
    }
    protected void adicionarPacienteNaFila(Paciente paciente){
        pacientes.add(paciente);
    }
    protected Paciente removerPacienteDaFila() throws FilaVaziaException {
        filaVazia();
        return pacientes.poll();
    }
    protected Paciente consultarProximoPaciente() throws FilaVaziaException{
        filaVazia();
        return pacientes.peek();
    }
    protected void filaVazia() throws FilaVaziaException{
        if(pacientes.isEmpty()){
            throw new FilaVaziaException("Erro:Fila vazia!");
        }
    }
}
