import java.util.ArrayList;
import java.util.List;

public class Corral {


    public List<Perro> getPerros = new ArrayList<>();
    public void AgregarPerro(Perro perro){
        getPerros.add(perro);
    }
    public Integer getPerros(){
        return getPerros.size();
    }

    public List<Gato> getGatos = new ArrayList<>();
    public void agregargato(Gato gato){
        getGatos.add(gato);
    }
    public Integer getGatos(){
        return getGatos.size();
    }


    public List<Gallina> getGallinas = new ArrayList<>();
    public void AgregarGallina(Gallina gallina){
        getGallinas.add(gallina);
    }
    public Integer getGallina(){
        return getGallinas.size();
    }



    public Perro getPerroMayor(){

        Perro perroM = getPerros.get(0);
        for (Perro p : this.getPerros){
            if (p.getEdad() > perroM.getEdad() ){
                perroM = p;
            }
        }
        return perroM;
    }

    public Gato getGatoMayor(){

        Gato gatoM = getGatos.get(0);
        for (Gato p : this.getGatos){
            if (p.getEdad() > gatoM.getEdad() ){
                gatoM = p;
            }
        }
        return gatoM;
    }

    public Gallina getGallinaMayor(){

        Gallina gallinaM = getGallinas.get(0);
        for (Gallina p : this.getGallinas){
            if (p.getEdad() > gallinaM.getEdad() ){
                gallinaM = p;
            }
        }
        return gallinaM;
    }

    public List<Perro> getNombreP(String NomBuscar){

        List<Perro> animalesByName = new ArrayList<>();
        for (Perro p : getPerros){
            if ( p.getNombre().equals(NomBuscar)){
                animalesByName.add(p);
            }
        }
        return animalesByName;
    }

    public List<Gato> getNombreG(String NomBuscar){

        List<Gato> animalesByName = new ArrayList<>();
        for (Gato p : getGatos){
            if ( p.getNombre().equals(NomBuscar)){
                animalesByName.add(p);
            }
        }
        return animalesByName;
    }

    public List<Gallina> getNombreO(String NomBuscar){

        List<Gallina> animalesByName = new ArrayList<>();
        for (Gallina p : getGallinas){
            if ( p.getNombre().equals(NomBuscar)){
                animalesByName.add(p);
            }
        }
        return animalesByName;
    }

    public  List<Perro> getOjosAzulP(){

        List<Perro> LAOA = new ArrayList<>();

        for (Perro p : getPerros){
            if ("azul".equals(p.getOjoDerecho().getColor()) || "azul".equals(p.getOjoIzquierdo().getColor())){
                LAOA.add(p);
            }
        }
        return LAOA;
    }

    public  List<Gato> getOjosAzulG(){

        List<Gato> LAOA = new ArrayList<>();

        for (Gato p : getGatos){
            if ("azul".equals(p.getOjoDerecho().getColor()) || "azul".equals(p.getOjoIzquierdo().getColor())){
                LAOA.add(p);
            }
        }
        return LAOA;
    }

    public  List<Gallina> getOjosAzulO(){

        List<Gallina> LAOA = new ArrayList<>();

        for (Gallina p : getGallinas){
            if ("azul".equals(p.getOjoDerecho().getColor()) || "azul".equals(p.getOjoIzquierdo().getColor())){
                LAOA.add(p);
            }
        }
        return LAOA;
    }

    public List<Perro> getVolumenAltoP(){

        List<Perro> LAVA = new ArrayList<>();

        for (Perro p : getPerros){
            if ("alto".equals(p.getSonido().getVolumen()) ){
                LAVA.add(p);
            }
        }
        return LAVA;
    }

    public List<Gato> getVolumenAltoG(){

        List<Gato> LAVA = new ArrayList<>();

        for (Gato p : getGatos){
            if ("alto".equals(p.getSonido().getVolumen()) ){
                LAVA.add(p);
            }
        }
        return LAVA;
    }

    public List<Gallina> getVolumenAltoO(){

        List<Gallina> LAVA = new ArrayList<>();

        for (Gallina p : getGallinas){
            if ("alto".equals(p.getSonido().getVolumen()) ){
                LAVA.add(p);
            }
        }
        return LAVA;
    }

    public List<Perro> getPerro1(Perro p){

        List<Perro> perros = new ArrayList<>();

        for (Perro pp : this.getPerros){
            if (pp.equals(p) && pp instanceof Perro){
                perros.add((Perro) pp);
            }
        }
        return perros;
    }

    public List<Gato> getGato1(Gato p){

        List<Gato> gatos = new ArrayList<>();

        for (Gato pp : this.getGatos){
            if (pp.equals(p) && pp instanceof Gato){
                gatos.add((Gato) pp);
            }
        }
        return gatos;
    }

    public List<Gallina> getGallina1(Gallina p){

        List<Gallina> gallinas = new ArrayList<>();

        for (Gallina pp : this.getGallinas){
            if (pp.equals(p) && pp instanceof Gallina){
                gallinas.add((Gallina) pp);
            }
        }
        return gallinas;
    }

    public double getSumaEdadesP(){
        int sumaEdades = 0;

        for (Perro perro: getPerros){
            sumaEdades += perro.getEdad();
        }

        return sumaEdades;
    }

    public double getSumaEdadesG(){
        int sumaEdades = 0;

        for (Gato gato: getGatos){
            sumaEdades += gato.getEdad();
        }

        return sumaEdades;
    }

    public double getSumaEdadesO(){
        int sumaEdades = 0;

        for (Gallina gallina: getGallinas){
            sumaEdades += gallina.getEdad();
        }

        return sumaEdades;
    }

}
