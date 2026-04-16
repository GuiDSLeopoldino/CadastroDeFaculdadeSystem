package br.com.fiap.faculdade.model;

public class Endereco {
        private String logradouro;
        private int numero;
        private int cep;
        private Cidade cidade;

            public Endereco(String logradouro, int numero, int cep,  Cidade cidade) {
                this.logradouro = logradouro;
                this.numero = numero;
                this.cep = cep;
                this.cidade = cidade;
            }
    @Override
    public String toString() {
        return logradouro + ", " + numero +
                " - CEP: " + cep +
                " - " + cidade.getNomeCidade() + "/" + cidade.getEstado();
    }

    public Endereco(){

    }


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
