package RealMadrid;

public interface Estadistica {
    String getTipo();
    int getValor();
    Jugador getJugador();
    void setTipo(String tipo);
    void setValor(int valor);
    void setJugador(Jugador jugador);
}

