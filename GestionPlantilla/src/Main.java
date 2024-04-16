import RealMadrid.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // INICIALIZAMOS TODOS LOS JUGADORES DE LA PLANTILLA
        Jugador Marc = new Jugador("Marc","Cañadas",30,Posiciones.Centrocampista,11);
        Jugador Courtois = new Jugador("Thibaut", "Courtois", 30, Posiciones.Portero, 1);
        Jugador Lunnin = new Jugador ("Andrey","Lunnin",20,Posiciones.Portero,13);
        Jugador Carvajal = new Jugador("Dani", "Carvajal", 30, Posiciones.Defensa, 2);
        Jugador Militao= new Jugador("Eder", "Militao", 24, Posiciones.Defensa, 3);
        Jugador Alaba = new Jugador("David", "Alaba", 30, Posiciones.Defensa, 4);
        Jugador Mendy = new Jugador("Ferland", "Mendy", 27, Posiciones.Defensa, 23);
        Jugador Valverde = new Jugador("Fede","Valverde",25,Posiciones.Centrocampista,15);
        Jugador Tchouameni = new Jugador("Aurelien", "Tchouameni", 22, Posiciones.Centrocampista, 18);
        Jugador Modric = new Jugador ("Luka","Modric",36,Posiciones.Centrocampista,10);
        Jugador Kroos = new Jugador("Toni", "Kroos", 34, Posiciones.Centrocampista, 8);
        Jugador Camavinga= new Jugador("Eduardo", "Camavinga", 22, Posiciones.Centrocampista, 12);
        Jugador Bellingham = new Jugador("Jude", "Bellingham", 20, Posiciones.Centrocampista, 5);
        Jugador Vinicius = new Jugador("Vinicius", "Junior", 22, Posiciones.Delantero, 7);
        Jugador Rodrygo= new Jugador("Rodrygo", "Goes", 23, Posiciones.Delantero, 6);
        Jugador Joselu = new Jugador("Joselu", "Mato", 29, Posiciones.Delantero, 17);
       //JUGADOR EXTRA PARA COMPROBAR EL CORRECTO FUNCIONAMIENTO DE TRY CATCH
        Jugador Nacho = new Jugador ("Nacho","Fernandez",31,Posiciones.Defensa,24);

        // CREAMOS LA PLANTILLA Y AÑADIMOS A TODOS LOS JUGADORES, MAX 16
        Plantilla PlantillaRM = new Plantilla();
        PlantillaRM.agregarJugador(Marc);
        PlantillaRM.agregarJugador(Courtois);
        PlantillaRM.agregarJugador(Lunnin);
        PlantillaRM.agregarJugador(Carvajal);
        PlantillaRM.agregarJugador(Militao);
        PlantillaRM.agregarJugador(Alaba);
        PlantillaRM.agregarJugador(Mendy);
        PlantillaRM.agregarJugador(Valverde);
        PlantillaRM.agregarJugador(Tchouameni);
        PlantillaRM.agregarJugador(Modric);
        PlantillaRM.agregarJugador(Kroos);
        PlantillaRM.agregarJugador(Camavinga);
        PlantillaRM.agregarJugador(Bellingham);
        PlantillaRM.agregarJugador(Vinicius);
        PlantillaRM.agregarJugador(Rodrygo);
        PlantillaRM.agregarJugador(Joselu);
        PlantillaRM.ComprobarPlantilla(); // COMPROBADOR DE PLANTILLA
        System.out.println("La plantilla consta de " + PlantillaRM.size()+ " jugadores");

        //JUGADORES DISPONIBLES ACTUALMENTE
        Courtois.alta();
        Lunnin.alta();
        Carvajal.alta();
        Militao.alta();
        Alaba.baja();
        Mendy.alta();
        Valverde.alta();
        Tchouameni.alta();
        Modric.alta();
        Kroos.alta();
        Camavinga.alta();
        Bellingham.alta();
        Vinicius.alta();
        Rodrygo.alta();
        Joselu.baja();

        System.out.println("Jugadores disponibles para el próximo partido: "+Arrays.toString(PlantillaRM.getJugadoresDisponibles()));
        System.out.println("Bajas para el próximo partido: " +Arrays.toString(PlantillaRM.getJugadoresNoDisponibles()));

        //CALENDARIO DE LA LIGA
        Partido jornada1 = new Partido(Equipos.RealMadrid,Equipos.Barcelona,"1/12/2024");
        Partido jornada2 = new Partido(Equipos.Atletico,Equipos.RealMadrid,"8/12/2024");
        Partido jornada3 = new Partido(Equipos.RealMadrid,Equipos.Mallorca,"15/12/2024");
        Partido jornada4 = new Partido(Equipos.Girona,Equipos.RealMadrid,"10/1/2025");
        Partido jornada5 = new Partido(Equipos.RealMadrid,Equipos.Athletic,"17/1/2025");
       // Partido jornada6 = new Partido(Equipos.RealMadrid,Equipos.Athletic,"24/1/2025"); //JORNADA PARA COMPROBAR TRY CATCH
        Calendario Liga = new Calendario();

        Liga.agregarPartido(jornada1);
        // JORNADA 1
        Goles golesMarc = new Goles(Marc);
        golesMarc.marcarGol();
        Goles golesVinicius = new Goles(Vinicius);
        golesVinicius.marcarGol();
        Asistencias asistenciasMarc = new Asistencias(Marc);
        asistenciasMarc.asistir();
        Tarjetas tarjetasCarvajal = new Tarjetas(Carvajal);
        tarjetasCarvajal.recibirTarjeta();
        Liga.agregarPartido(jornada2);
        // JORNADA 2
        tarjetasCarvajal.recibirTarjeta();
        golesVinicius.marcarGol();
        golesVinicius.marcarGol();
        golesVinicius.marcarGol();
        asistenciasMarc.asistir();
        Liga.agregarPartido(jornada3);
        // JORNADA 3
        tarjetasCarvajal.recibirTarjeta();
        Goles golesBellingham = new Goles(Bellingham);
        Asistencias asistenciasVinicius = new Asistencias(Vinicius);
        golesBellingham.marcarGol();
        golesBellingham.marcarGol();
        asistenciasMarc.asistir();

        Liga.agregarPartido(jornada4);
        // JORNADA 4
        tarjetasCarvajal.recibirTarjeta();
        Tarjetas tarjetasMarc = new Tarjetas(Marc);
        tarjetasMarc.recibirTarjeta();
        Liga.agregarPartido(jornada5);
        // JORNADA 5
        tarjetasCarvajal.recibirTarjeta();
        tarjetasMarc.recibirTarjeta();
       // Liga.agregarPartido(jornada6); // JORNADA DE SOBRA PARA COMPROBAR TRY CATCH
        Liga.ComprobarCalendario();
        int golesMarcadosMarc = golesMarc.getValor();
        int asistenciasdeMarc = asistenciasMarc.getValor();
        int tarjetasdeMarc = tarjetasMarc.getValor();
        boolean sancionesCarvajal = tarjetasCarvajal.sancionado();
        System.out.println("Esta Carvajal sancionado? " + sancionesCarvajal);
        System.out.println("Marc lleva " + golesMarcadosMarc+ " goles, " + asistenciasdeMarc + " asistencias y " + tarjetasdeMarc + " tarjetas");
        System.out.println(Vinicius);
        System.out.println("Jornada 1: "+ jornada1);

        //FICHAJES PROXIMA TEMPORADA
        Fichaje Pere = new Fichaje("Pere","Bonet",30,Posiciones.Defensa);
        System.out.println(Pere.getEstado());
    }
}
