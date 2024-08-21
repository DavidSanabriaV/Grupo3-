package PruebaProyecto;

public class Habitats {

    //Atributos 
    private String nombre;
    private String ambiente;
    private int capacidad;
    private int num;

    //Costructor
    public Habitats(String nombre, String ambiente, int capacidad, int num) {
        this.nombre = nombre;
        this.ambiente = ambiente;
        this.capacidad = capacidad;
        this.num = num;
    }

    //To string
    @Override
    public String toString() {
        return "" + "El nombre del habitat es: " + nombre + "\n"
                + "Su ambiente es: " + ambiente + "\n"
                + "Con capacidad de: " + capacidad + "\n"
                + "Con numero: " + num + "\n"
                + "--------------------------";
    }

    //Setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
