

public class Usuario {

    private String nombre;
    private String password;
    private int edad;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getPassword() {
        return this.password;
    }
    public int getEdad() {
        return this.edad;
    }

}