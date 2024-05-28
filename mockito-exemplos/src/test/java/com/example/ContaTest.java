package com.example;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {
    
    @Spy
    private Conta conta = new Conta(1000);

    @Test
    void validarOrdemChamada() {
        conta.pagarBoleto(300);

        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagarBoleto(300);
        inOrder.verify(conta).validarSaldo(300);
        inOrder.verify(conta).debitar(300);
        inOrder.verify(conta).enviarCreditoEmissor(300);
    }
}
