import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta> cuentas;

    public Banco() { this.cuentas = new ArrayList<Cuenta>(); }

    public void añadirCuenta(Cuenta c) { cuentas.add(c); }

    public void borrarCuenta(Cuenta c) { cuentas.remove(c); }
}
