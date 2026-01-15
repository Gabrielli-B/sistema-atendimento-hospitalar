package model;

import util.TipoAtendimento;

import java.util.Objects;

public class Paciente extends Pessoa{
    TipoAtendimento tipoAtendimento;

    public Paciente(String nome, int idade, long cpf, TipoAtendimento tipoAtendimento) {
        super(nome, idade, cpf);
        this.tipoAtendimento = tipoAtendimento;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + getNome()+ '\'' +
                ", idade=" + getIdade() +
                ", cpf=" + getCpf() +
                ", tipoAtendimento=" + tipoAtendimento +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        Paciente outroPaciente = (Paciente) obj;
        return this.getCpf() == outroPaciente.getCpf();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }

    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s | Idade: %d | CPF: %d | %s \n",getNome(),getIdade(),getCpf(),this.tipoAtendimento.getDescricao());
    }
}
