package com.example;

import java.time.LocalDate;

public class CadastroPessoa {
    
    private ApiDosCorreios apiDosCorreios;

    public CadastroPessoa(final ApiDosCorreios apiDosCorreios ) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscarDadosBaseCep(cep);
        pessoa.adicionarDadosEndereco(dadosLocalizacao);
        return pessoa;
    }
}
