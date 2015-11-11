
public Cuenta {

    private Usuario usuario;
    private List<Mensaje> bandejaEntrada;

    public Cuenta() {
        this.bandejaEntrada = new ArrayList<Mensaje>();
    }

    public void setUsuario(Usuario u) {
        this.usuario = u;
    }

    public void addMensaje(Mensaje m) {
        this.bandejaEntrada.add(m);
    }

    public Usuario getUsuario() {
        return this.usuario;
    }
    public List<Mensaje> getBandejaEntrada() {
        return this.bandejaEntrada;
    }
}