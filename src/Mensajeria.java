
public class Mensajeria {

    public Mensajeria() {
        // Constructor default
    }


    public void enviarMensaje(Cuenta destino, Mensaje m) {
        // Envia el mensaje a la cuenta destino
        destino.addMensaje(m);
    }
}