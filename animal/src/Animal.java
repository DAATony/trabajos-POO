import java.util.Objects;

public class Animal {

    private String Nombre;
    private String raza;
    private int edad;
    private Rabo Rabo;
    private Ojo ojoIzquierdo;
    private Ojo ojoDerecho;

    private Sonido Sonido;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad && Objects.equals(Nombre, animal.Nombre) && Objects.equals(raza, animal.raza) && Objects.equals(Rabo, animal.Rabo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, raza, edad);
    }

    public Animal(String nombre, String raza, int edad, Rabo rabo, Ojo ojoIzquierdo, Ojo ojoDerecho, Sonido sonido) {
        Nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        Rabo = rabo;
        this.ojoIzquierdo = ojoIzquierdo;
        this.ojoDerecho = ojoDerecho;
        Sonido = sonido;
    }

    public Sonido getSonido() {
        return Sonido;
    }

    public void setSonido(Sonido sonido) {
        Sonido = sonido;
    }

    public Pipi HacerPipi(){
        Pipi pipi = new Pipi("amarallo");
        return pipi;
    }

    public Animal(String nombre) { //constructor
        Nombre = nombre;
    }
    public Animal(){

    }


    @Override
    public String toString() {
        return
                "Nombre:" + Nombre + '\n' +
                        "Raza:" + raza + '\n' +
                        "Edad: " + edad +
                        '\n';
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Ojo getOjoIzquierdo() {
        return ojoIzquierdo;
    }

    public void setOjoIzquierdo(Ojo ojoIzquierdo) {
        this.ojoIzquierdo = ojoIzquierdo;
    }

    public Ojo getOjoDerecho() {
        return ojoDerecho;
    }

    public void setOjoDerecho(Ojo ojoDerecho) {
        this.ojoDerecho = ojoDerecho;
    }

    public Rabo getRabo() {
        return rabo;
    }

    public void setRabo(Rabo rabo) {
        this.rabo = rabo;
    }

    private Rabo rabo;

    public String getNombre() { //metodo devuelve el nombre
        return Nombre;
    }

    public void setNombre(String nombre) {// recibe el nombre y lo pone al odjeto
        Nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}