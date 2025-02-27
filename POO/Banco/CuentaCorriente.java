public class CuentaCorriente implements Cuenta {
    private double saldo;

    public CuentaCorriente(double saldo) { this.saldo = saldo; }

    @Override
    public void depositar(double valor) { saldo += valor; }

    @Override
    public void retirar(double valor) {
        if (saldo > valor)
            saldo += valor;
        else
            System.out.println("Saldo Insuficiente");
    }

    @Override
    public double getSaldo() { return saldo; }

    @Override
    public void calcularInteres() { System.out.println("Su interes es: " + saldo*0.001); }
}
