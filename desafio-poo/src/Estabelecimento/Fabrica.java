package Estabelecimento;

import Equipamento.Musica.ReproduzirMusica;
import Equipamento.Navegador.Navegador;
import Equipamento.Telefone.AparelhoTelefonico;
import EquipamentoIphone.EquipamentoIphone;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoIphone iphone = new EquipamentoIphone();
        ReproduzirMusica musica = (ReproduzirMusica) iphone;
        AparelhoTelefonico telefonico = (AparelhoTelefonico) iphone;
        Navegador internet = (Navegador) iphone;


        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        

        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();
        

        System.out.println("Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
        
    }
}
