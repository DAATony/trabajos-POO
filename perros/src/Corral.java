import java.util.ArrayList;
import java.util.List;

public class Corral {

    public List<Perro> perros = new ArrayList<>();
    public void AgregarPerro(Perro perro){
        perros.add(perro);
    }
    public Integer getPerros(){
        return perros.size();
    }

    public Perro PerroMayor(){

        Perro PerroM = perros.get(0);
        for (Perro p : this.perros){
            if (p.getEdad() > PerroM.getEdad() ){
                PerroM = p;
            }
        }
        return PerroM;
    }

    public List<Perro> getNombre(String NomBuscar){

        List<Perro> LPF = new ArrayList<>();
        for (Perro p : perros){
            if ( p.getNombre().equals(NomBuscar)){
                LPF.add(p);
            }
        }
        return LPF;
    }

    public  List<Perro> getOjosAzul(){

        List<Perro> LPOA = new ArrayList<>();

        for (Perro p : perros){
            if ("azul".equals(p.getOjoDerecho().getColor()) || "azul".equals(p.getOjoIzquierdo().getColor())){
                LPOA.add(p);
            }
        }
        return LPOA;
    }

    public List<Perro> getVolumenAlto(){

        List<Perro> LPVA = new ArrayList<>();

        for (Perro p : perros){
            if ("alto".equals(p.getLadrido().getVolumen()) ){
                LPVA.add(p);
            }
        }
        return LPVA;
    }

    public List<Perro> getPerro1(Perro perrob){

        List<Perro> LPB = new ArrayList<>();

        for (Perro p : perros){
            if (p.equals(perrob)){
                LPB.add(p);
            }
        }
        return LPB;
    }

}
