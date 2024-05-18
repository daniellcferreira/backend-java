package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero)); 
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatosPorNome) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Nome 1", 123456);
        agendaContatos.adicionarContato("Nome 1", 0);
        agendaContatos.adicionarContato("Nome 3", 111111);
        agendaContatos.adicionarContato("Nome 4", 654987);
        agendaContatos.adicionarContato("Nome 5", 111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Nome 1"));

        System.out.println("Contatos atualizados: " + agendaContatos.atualizarNumeroContato("Nome 6", 555555));
    }
}
