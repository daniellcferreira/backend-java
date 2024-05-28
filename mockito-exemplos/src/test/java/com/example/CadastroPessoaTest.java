package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastroPessoaTest {
    
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastroPessoa cadastroPessoa;

    @Test
    void validarDadosCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de Minas", "rua 2", "Apto", "centro");

        Mockito.when(apiDosCorreios.buscarDadosBaseCep("987654321")).thenReturn(dadosLocalizacao);

        Pessoa pessoa = cadastroPessoa.cadastrarPessoa("Daniel", "123456789", LocalDate.now(), "987654321");

        Assertions.assertEquals("Daniel", pessoa.getNome());
        Assertions.assertEquals("123456789", pessoa.getDocumento());
        Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
    }
}
