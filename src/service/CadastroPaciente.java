package service;

import exception.PacienteDuplicadoException;
import exception.PacienteNaoEncontradoException;
import model.Paciente;

import java.util.HashSet;

public class CadastroPaciente {
    protected HashSet<Paciente> pacientes = new HashSet<Paciente>();

    protected void cadastrarPaciente(Paciente novoPaciente) throws PacienteDuplicadoException{
        if(pacientes.contains(novoPaciente)){
            throw new PacienteDuplicadoException("Paciente já cadastrado");
        }
        pacientes.add(novoPaciente);
    }

    protected void listarPacientesCadastrados() throws PacienteNaoEncontradoException{
        if(pacientes.isEmpty()){
         throw new PacienteNaoEncontradoException("Não há pacientes cadastrados!");
        }
        for(Paciente p: pacientes){
            p.exibirDados();
        }
    }

    public Paciente buscarPacienteCpf(long cpf) throws PacienteNaoEncontradoException{
        for(Paciente p: pacientes){
            if(p.getCpf() == cpf){
                return p;
            }
        }
        throw new PacienteNaoEncontradoException("Paciente não encontrado!");
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }
}
