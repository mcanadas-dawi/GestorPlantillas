package RealMadrid;
//CONTROL DE GOLES
public class Goles implements Estadistica {
private String tipo;
private int valor;
private Jugador jugador;
public Goles (Jugador jugador) {
    this.tipo = "Gol";
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

    public void marcarGol() {
        this.valor++;
    }
}

