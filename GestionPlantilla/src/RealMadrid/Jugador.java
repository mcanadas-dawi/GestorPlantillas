package RealMadrid;
//CLASE JUGADOR PARA DEFINIR EL OBJETO Y SUS ATRIBUTOS
public class Jugador extends Persona {
    private boolean disponible;
    private final int dorsal;

    public Jugador(String nombre, String apellido, int edad, Posiciones posicion, int dorsal) {
        super(nombre, apellido, edad, posicion);
        this.dorsal = dorsal;
    }

    public boolean getDisponible() {
        return disponible;
    }
    public void alta() {
        disponible=true;
    }
    public void baja() {
        disponible=false;
    }


    public int getDorsal() {
        return dorsal;
    }
    @Override
    public String toString() {
        return "{ disponible=" + disponible +
                ", nombre= " + nombre +
                ", apellido= " + apellido +
                ", edad= " + edad +
                ", posicion= " + posicion +
                ", dorsal= " + dorsal +
                " }";
    }
}



