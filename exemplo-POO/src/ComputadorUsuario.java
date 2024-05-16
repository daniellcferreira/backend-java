import applicativos.FacebookMessenger;
import applicativos.MsnMessenger;
import applicativos.ServicoMensagemInstantanea;
import applicativos.Telegram;

public class ComputadorUsuario {
    
    public static void main(String[] args) {
        
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new MsnMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
