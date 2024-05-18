package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> agendaContatoMaps;

    public AgendaContatos() {
        this.agendaContatoMaps = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMaps.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMaps.isEmpty()) {
            agendaContatoMaps.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMaps);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if(!agendaContatoMaps.isEmpty()) {
            agendaContatoMaps.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Nome 1", 123456);
        agendaContatos.adicionarContato("Nome 2", 5665);
        agendaContatos.adicionarContato("Nome 3", 111111);
        agendaContatos.adicionarContato("Nome 4", 654987);
        agendaContatos.adicionarContato("Nome 5", 111111);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Nome 1");
        agendaContatos.exibirContatos();

        System.out.println("O nome é: " + agendaContatos.pesquisarPorNome("Nome 4"));

    }
}
