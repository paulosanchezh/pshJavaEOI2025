public class TestBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(5.6);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000000.45);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(300000.45);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(2000.45);

        cuentaCorriente.calcularInteres();
        System.out.println(cuentaCorriente.getSaldo());
        cuentaCorriente.depositar(300000.45);
        System.out.println(cuentaCorriente.getSaldo());
        cuentaCorriente.retirar(20);

        banco.añadirCuenta(cuentaCorriente);
        banco.añadirCuenta(cuentaAhorro);
        banco.añadirCuenta(cuentaCorriente2);
        banco.añadirCuenta(cuentaAhorro2);
    }
}
