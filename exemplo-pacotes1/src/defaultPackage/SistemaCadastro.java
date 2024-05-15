package defaultPackage;

public class SistemaCadastro {
    
    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("123", "Marcos");


        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
