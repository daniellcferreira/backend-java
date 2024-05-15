package defaultPackage;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa (String cpf, String nome) {
        this.nome = nome;
        this.cpf =cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
