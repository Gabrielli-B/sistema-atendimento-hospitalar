package util;

public enum TipoAtendimento {
    VERMELHO("Atendimento imediato",1),
    LARANJA("Atendimento muito urgente",2),
    AMARELO("Atendimento urgente",3),
    VERDE("Atendimento pouco urgente",4),
    AZUL("Atendimento não urgente",5);

    private final String descricao;
    private final int prioridade;

    TipoAtendimento(String descricao,int prioridade){
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricao() {
        return descricao;
    }
}
