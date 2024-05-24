import java.util.Scanner;

// Loop infinito para manter o programa em execução até que o usuário decida sair
// TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
// Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:   

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean chave = true;
        
        while (chave) { 
            int opcao = scanner.nextInt(); 
            
            switch(opcao){
                  case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                  case 2:
                    double saque = scanner.nextDouble();
                    if(saque > saldo){
                      System.out.println("Saldo insuficiente.");
                      System.out.println("Programa encerrado.");
                      chave=false;
                      break;
                    }else{
                      saldo -= saque;
                      System.out.println("Saldo atual: " + saldo);
                      break;
                    }
                  case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                  case 0:
                    System.out.println("Programa encerrado.");
                    chave = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
        scanner.close();
    }
    
}
