package RealMadrid;
//CONTROL DE ASISTENCIAS
public class Asistencias implements Estadistica {
    private String tipo;
    private int valor;
    private Jugador jugador;
    public Asistencias (Jugador jugador) {
        this.tipo = "Asistencia";
        this.valor = 0;
        this.jugador = jugador;
    }
    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public Jugador getJugador() {
        return jugador;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void asistir() {
        this.valor++;
    }
}
