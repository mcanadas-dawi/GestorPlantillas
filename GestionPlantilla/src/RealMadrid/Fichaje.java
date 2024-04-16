package RealMadrid;
//CLASE PARA FUTURAS INCORPORACIONES
 public class Fichaje extends Persona {
     private String nombre = "Fichado próxima temporada";

     public Fichaje(String nombre, String apellido, int edad, Posiciones posicion) {
         super(nombre, apellido, edad, posicion);
     }

     @Override
     public String getNombre() {
         return super.nombre;
     }

     public String getEstado() {
         return this.nombre;
     }
 }
