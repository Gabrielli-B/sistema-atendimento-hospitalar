package model;

import exception.FilaVaziaException;
import service.FilaPrioridade;

public interface Atendimento {

    void atenderPaciente(FilaPrioridade filaAtendimento) throws FilaVaziaException;

}
