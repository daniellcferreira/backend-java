package lanchonete;

import lanchonete.areaCliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelicimento {
    
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();

        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        
    }

}
