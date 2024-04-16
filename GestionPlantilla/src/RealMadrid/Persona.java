package RealMadrid;

public abstract class Persona {
    protected final String nombre;
    protected final String apellido;
    protected final int edad;
    protected final Posiciones posicion;

    public Persona(String nombre, String apellido, int edad, Posiciones posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public Posiciones getPosicion() {
        return posicion;
    }

}

