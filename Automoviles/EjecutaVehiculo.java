public class EjecutaVehiculo {
    public static void main(String[] args) {
        Autobus bus = new Autobus(25,"Mercedes",4,4,5,5);
        Motocicleta moto = new Motocicleta(20, "Vespa", 2, 3);

        bus.mostrarDatos();
        bus.apagarMotor();
        moto.apagarMotor();
        moto.mostrarCaracteristicas();
        moto.mostrarDatos();
    }
}
