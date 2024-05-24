import java.util.Scanner; 


// TODO: Leia a entrada do usuário como uma string representando o número da conta:
// TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
// Imprime que o número de conta é válido:
// TODO: Inicialize um bloco try-catch para capturar exceções:
// TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
// TODO: Verifique se o número da conta tem exatamente 8 dígitos:
// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
      Scanner scanner = new Scanner(System.in); 
      String conta = scanner.nextLine();

      try{
        verificarNumeroConta(conta);
      }catch(IllegalArgumentException e){
        System.out.println(e.getMessage()); 
      } finally {
          scanner.close();
      }
    }
    
    private static boolean verificarNumeroConta(String numeroConta) { 
      if(numeroConta.length() != 8){
        throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
      }else{
        System.out.println("Numero de conta valido."); 
        return true;
      }
    }
  } 
