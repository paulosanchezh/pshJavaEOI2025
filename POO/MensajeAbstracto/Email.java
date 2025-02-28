package mensajes;

public class Email extends Mensaje {
    private String correo;

    public Email(String mensaje, String correo) {
        super(mensaje);
        this.correo = correo;
    }

    @Override
    public void enviar() {
        System.out.println("Correo: " + correo + " envia este mensaje: " + getMensaje());
    }
}
