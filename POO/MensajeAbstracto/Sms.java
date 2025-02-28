package mensajes;

public class Sms extends Mensaje {
    private int movil;

    public Sms(String mensaje, int movil) {
        super(mensaje);
        this.movil = movil;
    }

    @Override
    public void enviar() {
        System.out.println("Movil: " + movil + " envia este sms: " + getMensaje());
    }
}
