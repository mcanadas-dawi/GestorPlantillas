package RealMadrid;
import java.util.ArrayList;
import java.util.List;
//CLASE PARA ALMACENAR LOS JUGADORES DE LA PLANTILLA
public class Plantilla {
    private List<Jugador> jugadores;
    private final int jugadoresMaximos;

    public Plantilla() {
        jugadores = new ArrayList<>();
        jugadoresMaximos = 16;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public int size() {
        return jugadores.size();
    }
    //COMPROBADOR DE PLANTILLA CORRECTA
    public void ComprobarPlantilla() {
        try {
            if (jugadores.size() <= jugadoresMaximos) {
              System.out.println("La plantilla es correcta");
            } else {
                throw new PlantillaExcepcion("Sobran jugadores");
                }

        } catch (PlantillaExcepcion e) {
            throw new IndexOutOfBoundsException (e.getMessage());
        } finally {
            System.out.println("Recuerda que el numero máximo de jugadores en plantilla debe ser 16");
        }
    }
    // JUGADORES DISPONIBLES
    public  String[] getJugadoresDisponibles() {
        List<String> ListaDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (jugador.getDisponible()) {
                ListaDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] DisponiblesArray = new String[ListaDisponibles.size()];
        ListaDisponibles.toArray(DisponiblesArray);

        return DisponiblesArray;
    }
    //JUGADORES NO DISPONIBLES
    public  String[] getJugadoresNoDisponibles() {
        List<String> ListaNoDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (!jugador.getDisponible()) {
                ListaNoDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] NoDisponiblesArray = new String[ListaNoDisponibles.size()];
        ListaNoDisponibles.toArray(NoDisponiblesArray);

        return NoDisponiblesArray;
    }
}
//CLASE PARA EL ERROR
class PlantillaExcepcion extends Exception {
    public PlantillaExcepcion(String mensaje) {
        super(mensaje);
    }
}


