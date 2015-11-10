

/**
 * Prueba de la clase mensaje.
 */
public class TestMensaje {

    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        mensaje.setOrigen("RedHawk14");
        mensaje.setDestino("Todos");
        mensaje.setAsunto("Ejemplo");
        mensaje.setContenido("Esto es un ejemplo de mensaje.");


        System.out.println("Mensaje:\n" + mensaje.toString());
    }
}