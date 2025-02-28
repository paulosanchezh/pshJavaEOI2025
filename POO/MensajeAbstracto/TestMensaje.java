package mensajes;

public class TestMensaje {
    public static void main(String[] args) {
        Email email = new Email("La hoja de firmas está enviadad", "castaña@alum.eoi");
        Sms sms = new Sms("Un paquete suyo espera en correos, meta ahora toda su informacion en este enlace" +
                "y le robaremos sin problema", 634353000);
        MensajeGrabado grabado = new MensajeGrabado("No te olvides de apagar el fuego", 956260743);

        email.enviar();
        sms.enviar();
        grabado.enviar();
    }
}
