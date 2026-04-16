package br.com.fiap.faculdade.model;

public class AlunoFaculdade {

    private int registroMatricula;
    private String nome;
    private Endereco endereco;

            public AlunoFaculdade(int registroMatricula, String nome) {
                this.registroMatricula = registroMatricula;
                this.nome = nome;
            }

    public AlunoFaculdade() {

    }

    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        this.registroMatricula = registroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}