package mensajes;

public abstract class Mensaje {
    private String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() { return mensaje; }

    public abstract void enviar();
}
