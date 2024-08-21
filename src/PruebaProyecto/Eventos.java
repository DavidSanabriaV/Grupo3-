package PruebaProyecto;

public class Eventos {

    //Atributos
    private String nombre;
    private String fecha;
    private int id;
    private String descripcion;

    //To String
    @Override
    public String toString() {
        return "" + "El nombre del evento es: " + nombre + "\n"
                + "con fecha: " + fecha + "\n"
                + "El id es: " + id + "\n"
                + "La descripcion del evento es: " + descripcion
                + "\n" + "--------------------";
    }

    //Constructor
    public Eventos(String nombre, String fecha, int id, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id = id;
        this.descripcion = descripcion;
    }

    //Setter y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
