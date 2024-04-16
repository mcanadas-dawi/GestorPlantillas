package RealMadrid;

public class Partido {
    protected Equipos local;
    protected Equipos visitante;
    protected String fecha;

    public Partido(Equipos local, Equipos visitante, String fecha) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
    }
    public Equipos getLocal() {
        return local;
    }

    public Equipos getVisitante() {
        return visitante;
    }

    public String getFecha() {
        return fecha;
    }


    public void setLocal(Equipos local) {
        this.local = local;
    }

    public void setVisitante(Equipos visitante) {
        this.visitante = visitante;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String toString() {
        return "{ Local= " + local +
                ", visitante = " + visitante +
                ", fecha= " + fecha +
                " }";
    }
}
