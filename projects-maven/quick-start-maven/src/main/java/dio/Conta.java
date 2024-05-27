package dio;

public class Conta {

    private String numeroConta;
    private int saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
