package service;

import exception.FilaVaziaException;
import exception.PacienteDuplicadoException;
import exception.PacienteNaoEncontradoException;
import model.Paciente;
import model.Pessoa;
import util.TipoAtendimento;

public class Hospital {
    private CadastroPaciente cadastroPaciente;
    private FilaPrioridade filaPrioridade;
    private Atender atender;

    public Hospital() {
        this.cadastroPaciente = new CadastroPaciente();
        this.filaPrioridade = new FilaPrioridade();
        this.atender = new Atender();
    }

    public void cadastrarPaciente(String nome, int idade, long cpf,TipoAtendimento tipoAtendimento) throws PacienteDuplicadoException {
        Paciente paciente = new Paciente(nome,idade,cpf,tipoAtendimento);
        cadastroPaciente.cadastrarPaciente(paciente);
    }

    public void adicionarNaFila(long cpf) throws PacienteNaoEncontradoException{
        filaPrioridade.adicionarPacienteNaFila(cadastroPaciente.buscarPacienteCpf(cpf));
    }

    public void atender() throws FilaVaziaException {
        atender.atenderPaciente(filaPrioridade);
    }

    public Paciente consultarProximoPacienteNaFila() throws FilaVaziaException{
      return  filaPrioridade.consultarProximoPaciente();
    }

    /*public void listarPacientesAtendidos(){
        System.out.println(atender.getPacientesAtendidos());
    }*/
    public void listarPacientesAtendidos(){
       for(Paciente p: atender.getPacientesAtendidos()){
           p.exibirDados();
       }
    }
    public void buscarPacientePeloCpf(long cpf) throws PacienteNaoEncontradoException{
        System.out.println(cadastroPaciente.buscarPacienteCpf(cpf));
    }
    public void listarPacientesCadastrados() throws PacienteNaoEncontradoException{
        cadastroPaciente.listarPacientesCadastrados();
    }
}
