package model;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private long cpf;

    public Pessoa(String nome, int idade, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public long getCpf() {
        return cpf;
    }
    public void exibirDados(){
        System.out.printf("Nome: %s | Idade: %d | CPF: %d",this.nome,this.idade,this.cpf);
    }
}
