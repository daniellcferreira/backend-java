package dio;

import java.util.logging.Logger;

public class BancoDeDados {
    
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        LOGGER.info("inseriou dados");
    }

    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("removeu dados");
    }
}
