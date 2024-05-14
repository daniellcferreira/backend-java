package lanchonete;

import lanchonete.areaCliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelicimento {
    
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();

        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();

        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();

        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();

        atendente.trocarGas();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        cliente.pegarPedidoBalcao();

        cliente.consultarSaldoAplicativo();

        cozinheiro.pedirParaTrocarGas(almoxarife);
        cozinheiro.pedirParaTrocarGas(atendente);
    }

}
