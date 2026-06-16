import java.util.Objects;

public class Perro {
    private String Nombre;
    private String raza;
    private int edad;
    private Rabo Rabo;
    private Ojo ojoIzquierdo;
    private Ojo ojoDerecho;

    private Ladrido Ladrido;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return edad == perro.edad && Objects.equals(Nombre, perro.Nombre) && Objects.equals(raza, perro.raza) && Objects.equals(Rabo, perro.Rabo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, raza, edad);
    }

    public Perro(String nombre, String raza, int edad, Rabo rabo, Ojo ojoIzquierdo, Ojo ojoDerecho, Ladrido ladrido) {
        Nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        Rabo = rabo;
        this.ojoIzquierdo = ojoIzquierdo;
        this.ojoDerecho = ojoDerecho;
        Ladrido = ladrido;
    }

    public Ladrido getLadrido() {
        return Ladrido;
    }

    public void setLadrido(Ladrido ladrido) {
        Ladrido = ladrido;
    }

    public Pipi HacerPipi(){
        Pipi pipi = new Pipi("amarallo");
        return pipi;
    }

    public Perro(String nombre) { //constructor
        Nombre = nombre;
    }
    public Perro(){

    }

    public Perro(String nombre, String raza, int edad) {
        this.Nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public Perro(String nombre, String raza, int edad, Rabo rabo) {
        Nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        Rabo = rabo;
    }

    public Perro(String nombre, String raza, int edad, Rabo rabo, Ojo ojoIzquierdo, Ojo ojoDerecho) {
        Nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        Rabo = rabo;
        this.ojoIzquierdo = ojoIzquierdo;
        this.ojoDerecho = ojoDerecho;
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