package com.example;

public class Conta {
    
    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public void pagarBoleto(int valorApagar) {
        validarSaldo(valorApagar);
        debitar(valorApagar);
        enviarCreditoEmissor(valorApagar);
    }

    public void validarSaldo(int valorApagar) {
        if(valorApagar > saldo) {
            throw new IllegalStateException("Saldo insuficiente!");
        }
    }

    public void debitar(int valorApagar) {
        this.saldo = this.saldo - valorApagar;
    }

    public void enviarCreditoEmissor(int valorApagar) {
        
    }
}
