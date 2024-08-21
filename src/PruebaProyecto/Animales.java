
package PruebaProyecto;


public class Animales {

    //Atributos 
    private String nombre;
    private int edad;
    private String especie;
    private int habitat;
    private int ani;
    private String alimento;
    private int horario;
    private int frecuencia;
    //Constructor

    public Animales(String nombre, int edad, String especie, int habitat, int ani, String alimento, int horario, int frecuencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.habitat = habitat;
        this.ani = ani;
        this.alimento = alimento;
        this.horario = horario;
        this.frecuencia = frecuencia;
    }
    //To string

    @Override
    public String toString() {
        return "" + "El nombre del animal es: " + nombre + "\n"
                + "La edad del animal es: " + edad + "\n"
                + "La especie del animal es: " + especie + "\n"
                + "El habitat del animal es: " + habitat + "\n"
                + "El numero de ani es: " + ani + "\n"
                + "El alimento es: " + alimento
                + " a las " + horario
                + " con una frecuencia de " + frecuencia + "\n" + "--------------------------------------";
    }
    //Setter y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getHabitat() {
        return habitat;
    }

    public void setHabitat(int habitat) {
        this.habitat = habitat;
    }

    public int getAni() {
        return ani;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

}
