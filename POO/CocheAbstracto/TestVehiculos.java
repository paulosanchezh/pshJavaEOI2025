package coche;

public class TestVehiculos {
    public static void main(String[] args) {
        TodoTerreno todoTerreno = new TodoTerreno("suzuki", "negro", 190);
        Tractor tractor = new Tractor("Mercedes", "Castaña", 60);
        Deportivo deportivo = new Deportivo("Ferrari", "red", 300);

        System.out.println("Modelo de todo terreno: " + todoTerreno.getModelo() + " con color " + todoTerreno.getColor()
            + " con velocidad maxima " + todoTerreno.getVelocidadMax());
        todoTerreno.acelerar();
        todoTerreno.frenar();
        System.out.println();

        System.out.println("Modelo de tractor: " + tractor.getModelo() + " con color " + tractor.getColor()
                + " con velocidad maxima " + tractor.getVelocidadMax());
        tractor.acelerar();
        tractor.frenar();
        System.out.println();

        System.out.println("Modelo de deportivo: " + deportivo.getModelo() + " con color " + deportivo.getColor()
                + " con velocidad maxima " + deportivo.getVelocidadMax());
        deportivo.acelerar();
        deportivo.frenar();
    }
}
