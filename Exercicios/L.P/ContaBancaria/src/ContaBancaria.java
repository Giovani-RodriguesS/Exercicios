public class ContaBancaria {

    private String titular;
    private double saldo;
    private int numero;

    public ContaBancaria(String titular, double saldo, int numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public void depositar (double valor)
    {
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito bem sucedido");
        }
        else
            System.out.println("Deposito não realizado");
    }
}
