import exception.FilaVaziaException;
import exception.PacienteDuplicadoException;
import exception.PacienteNaoEncontradoException;
import service.Hospital;
import util.TipoAtendimento;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        try{
            hospital.cadastrarPaciente("Ana",45,2345679809L, TipoAtendimento.AMARELO);
            hospital.cadastrarPaciente("Ana",25,1345679408L, TipoAtendimento.AZUL);
            hospital.cadastrarPaciente("João",70,87950832145L, TipoAtendimento.LARANJA);
            hospital.cadastrarPaciente("Kayla",15,5367679800L, TipoAtendimento.AMARELO);
            hospital.cadastrarPaciente("Jonas",28,3148677809L, TipoAtendimento.VERDE);
            hospital.cadastrarPaciente("Enely",95,2648679109L, TipoAtendimento.VERMELHO);
            hospital.cadastrarPaciente("Vanessa",12,2346699809L, TipoAtendimento.VERDE);

            hospital.adicionarNaFila(2345679809L);
            hospital.adicionarNaFila(1345679408L);
            hospital.adicionarNaFila(87950832145L);
            hospital.adicionarNaFila(5367679800L);
            hospital.adicionarNaFila(3148677809L);
            hospital.adicionarNaFila(2648679109L);
            hospital.adicionarNaFila(2346699809L);
           // hospital.adicionarNaFila(5555555555L);//Paciente não encontrado
            hospital.atender();
            hospital.atender();

            System.out.println("\nLista Pacientes atendidos:");
            hospital.listarPacientesAtendidos();

            System.out.println("\nPróximo paciente da fila:");
            hospital.consultarProximoPacienteNaFila().exibirDados();

            System.out.println("\nBuscar paciente pelo CPF:");
            hospital.buscarPacientePeloCpf(2345679809L);

            System.out.println("\nPacientes cadastrados em sistema");
            hospital.listarPacientesCadastrados();
        }catch (PacienteDuplicadoException | PacienteNaoEncontradoException | FilaVaziaException e){
            System.out.println(e.getMessage());
        }
    }
}
