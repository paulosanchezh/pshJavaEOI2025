package mensajes;

public class MensajeGrabado extends Mensaje {
    int telefono;

    public MensajeGrabado(String mensaje, int telefono) {
        super(mensaje);
        this.telefono = telefono;
    }

    @Override
    public void enviar() {
        System.out.println("Telefono: " + telefono + " tiene guardado este mensaje " + getMensaje());
    }
}
