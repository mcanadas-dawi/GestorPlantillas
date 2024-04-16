package RealMadrid;
//CONTROL DE TARJETAS
public class Tarjetas implements Estadistica {
    private String tipo;
    private int valor;
    private Jugador jugador;
    public Tarjetas (Jugador jugador) {
        this.tipo = "Tarjeta";
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

    public void recibirTarjeta() {
        this.valor++;
    }
    public boolean sancionado() {
        if (valor%5==0) {
            jugador.baja();
            return true;
        }
        return false;
    }
}
