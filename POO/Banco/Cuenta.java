public interface Cuenta {
    public void depositar(double valor);
    public void retirar(double valor);
    public double getSaldo();
    public void calcularInteres();
}
