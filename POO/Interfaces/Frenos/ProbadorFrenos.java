package POO.Clase1.EjercicioFrenable;

public class ProbadorFrenos {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(5, 15, false);
        System.out.printf("Velocidad bicicleta: %d \nMarcha bicicleta: %d\n", bicicleta.getVelocidad(), bicicleta.getMarcha());
        bicicleta.frenar();
        bicicleta.bajarMarcha();
        bicicleta.soltarFrenos();
        System.out.printf("Velocidad bicicleta: %d \nMarcha bicicleta: %d\n", bicicleta.getVelocidad(), bicicleta.getMarcha());
        Coche coche = new Coche(false, 100);
        System.out.println("Velocidad coche: " + coche.getVelocidad());
        coche.frenar();
        coche.soltarFrenos();
        System.out.println("Velocidad coche: " + coche.getVelocidad());
    }
}
