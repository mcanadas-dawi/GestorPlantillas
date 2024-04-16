package RealMadrid;
import java.util.ArrayList;
import java.util.List;

public class Calendario {
  private List<Partido> partidos;
  private int jornadas;
  public Calendario() {
      partidos = new ArrayList<>();
      jornadas = 5;
  }
  public void agregarPartido(Partido partido) {
      partidos.add(partido);
  }

    public List<Partido> getPartidos() {
        return partidos;
    }
    public int sizePartidos() {
      return partidos.size();
    }
    public void ComprobarCalendario() {
        try {
            if (partidos.size() == jornadas) {
                System.out.println("El calendario es correcto");
            } else {
                if (partidos.size() < jornadas) {
                    System.out.println("Faltan jornadas!");
                } else {
                    throw new CalendarioExcepcion("Sobran jornadas!");
                }
            }
        } catch (CalendarioExcepcion e) {
            throw new IndexOutOfBoundsException (e.getMessage());

        } finally {
            System.out.println("Recuerda que la liga tiene 5 jornadas");
        }
    }
}


class CalendarioExcepcion extends Exception {
    public CalendarioExcepcion(String mensaje) {
        super(mensaje);
    }
}


