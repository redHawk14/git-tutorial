
public class Mensaje {

    private String origen;
    private String destino;
    private String asunto;
    private String contenido;

    public Mensaje() {
        // Constructor default
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public String getAsunto() {
        return this.asunto;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String toString() {
        return "De: " + this.origen + "\nPara: " + this.destino
                + "\nAsunto: " + this.asunto + "\nContenido: " + this.contenido;
    }
}