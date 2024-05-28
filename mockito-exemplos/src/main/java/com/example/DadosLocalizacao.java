package com.example;

public class DadosLocalizacao {
    
    private String uf;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;

    public DadosLocalizacao(final String uf, final String cidade, final String logradouro, final String complemento, final String bairro) {
        this.uf = uf;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }
}
