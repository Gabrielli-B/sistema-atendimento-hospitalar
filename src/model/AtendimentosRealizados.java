package model;

import java.util.ArrayList;
import java.util.List;

public class AtendimentosRealizados {
    List<Paciente> pacientesAtendidos = new ArrayList<>();

    public void adicionarListaAtendimentosRealizados(Paciente paciente){
        pacientesAtendidos.add(paciente);
    }

    public List<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }

}
