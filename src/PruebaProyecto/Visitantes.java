package PruebaProyecto;

public class Visitantes {
    //Atributos 

    private String Nombre;
    private int edad;
    private int fecha;
    private int id;
    //Constructor

    public Visitantes(String Nombre, int edad, int fecha, int id) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.id = id;
    }

    //To string
    @Override
    public String toString() {
        return "" + "Nombre: " + Nombre + " de " + edad + " años" + "\n"
                + "la fecha de ingreso es: " + fecha + "\n"
                + "numero: " + id + "\n" + "---------------------------";
    }

    //Setter y getters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
