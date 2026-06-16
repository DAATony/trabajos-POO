import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Corral corral = new Corral();
        Scanner sc = new Scanner(System.in);
        String Nombre,raza,Rabotipo,Rabocolor,LadridoVolumen,OjoIzquierdoColor,OjoIzquierdoTipo, OjoDerechoColor, OjoDerechoTipo,BuscarNom;
        int edad, opc,opcP,N = 0;

        new Perro("coco","frenchpoodle",2,new Rabo("blanco","largo"),new Ojo("verde","grande"),new Ojo("verde","grande"),new Ladrido("mediano"));

        corral.AgregarPerro(new Perro("alessandro","chihuahua",18,new Rabo("blanco","largo"),new Ojo("cafe","chino"),new Ojo("cafe","chino"),new Ladrido("alto")));

        corral.AgregarPerro(new Perro("firulais","chihuahua",4,new Rabo("negro","largo"),new Ojo("verde","chino"),new Ojo("verde","chino"),new Ladrido("mediano")));

        corral.AgregarPerro(new Perro("negrito","bulldog",6,new Rabo("negro","corto"),new Ojo("cafe","grande"),new Ojo("azul","grande"),new Ladrido("bajo")));

        corral.AgregarPerro(new Perro("manchas","dalmata",9,new Rabo("blanco","corto"),new Ojo("blanco","grande"),new Ojo("cafe","grande"),new Ladrido("bajo")));

        corral.AgregarPerro(new Perro("terry","frenchPuddle",10,new Rabo("blanco","corto"),new Ojo("azul","grande"),new Ojo("azul","grande"),new Ladrido("alto")));

        boolean repetir = true;

        do {
            System.out.println("---------------------------------");
            System.out.println("Elije la opcion deseada:");
            System.out.println("1-Agregar perro");
            System.out.println("2-Lista de perros");
            System.out.println("3-Numero de perros en el corral");
            System.out.println("4-Perro de mayor edad");
            System.out.println("5-Perros llamados firulais");
            System.out.println("6-Perros con los ojos azules");
            System.out.println("7-Perros con Ladrido alto");
            System.out.println("8-Perros repetidos");
            System.out.println("0-Salir");
            System.out.println("---------------------------------");

            try {
                opcP = sc.nextInt();

                switch (opcP) {

                    case 1:
                        System.out.println("Escribe el nombre del perro:");
                        Nombre = sc.next();

                        System.out.println("Escribe la raza del perro:");
                        raza = sc.next();

                        System.out.println("Ingresa la edad del perro:");
                        edad = sc.nextInt();

                        System.out.println("Ingresa el color del rabo:");
                        Rabocolor = sc.next();

                        System.out.println("Ingresa el tamaño de rabo:");
                        Rabotipo = sc.next();

                        System.out.println("Ingresa el color del ojo derecho:");
                        OjoDerechoColor = sc.next();

                        System.out.println("Ingresa el color del ojo izquierdo:");
                        OjoIzquierdoColor = sc.next();

                        System.out.println("Ingresa el tipo del ojo derecho:");
                        OjoDerechoTipo = sc.next();

                        System.out.println("Ingresa el tipo del ojo izquierdo:");
                        OjoIzquierdoTipo = sc.next();

                        System.out.println("Ingresa el volumen del ladrido:");
                        LadridoVolumen = sc.next();

                        corral.AgregarPerro(new Perro(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo), new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor, OjoDerechoTipo), new Ladrido(LadridoVolumen)));

                        break;

                    case 2:
                        for (Perro p : corral.perros) {
                            N++;
                            System.out.println("Perro " + N);
                            System.out.println(p);
                        }
                        break;

                    case 3:
                        System.out.println("Perros en el corral: " + corral.perros.size() + "\n");
                        break;

                    case 4:
                        System.out.println("El perro mas viejo es: \n" + corral.PerroMayor());
                        break;

                    case 5:
                        System.out.println("Ingresa el nombre del perro a buscar:");
                        BuscarNom = sc.next();
                        System.out.println("Los perros llamados " + BuscarNom + " son:");
                        for (Perro p : corral.getNombre(BuscarNom)) {

                            System.out.println(p);
                        }
                        break;

                    case 6:
                        System.out.println("Los perros con ojos azules son:");
                        if (!corral.getOjosAzul().isEmpty()) {
                            for (Perro p : corral.getOjosAzul()) {

                                System.out.println(p);
                            }
                        } else {
                            System.out.println("No hay");
                        }
                        break;

                    case 7:
                        System.out.println("Los perros con el volumen alto son:");
                        if (!corral.getVolumenAlto().isEmpty()) {
                            for (Perro p : corral.getVolumenAlto()) {
                                System.out.println(p);
                            }
                        } else {
                            System.out.println("No hay");
                        }
                        break;

                    case 8:

                        System.out.println("Ingresa los datos del perro a buscar");

                        System.out.println("Escribe el nombre del perro:");
                        Nombre = sc.next();

                        System.out.println("Escribe la raza del perro:");
                        raza = sc.next();

                        System.out.println("Ingresa la edad del perro:");
                        edad = sc.nextInt();

                        System.out.println("Ingresa el color del rabo:");
                        Rabocolor = sc.next();

                        System.out.println("Ingresa el tamaño de rabo:");
                        Rabotipo = sc.next();

                        System.out.println("Ingresa el color del ojo derecho:");
                        OjoDerechoColor = sc.next();

                        System.out.println("Ingresa el color del ojo izquierdo:");
                        OjoIzquierdoColor = sc.next();

                        System.out.println("Ingresa el tipo del ojo derecho:");
                        OjoDerechoTipo = sc.next();

                        System.out.println("Ingresa el tipo del ojo izquierdo:");
                        OjoIzquierdoTipo = sc.next();

                        System.out.println("Ingresa el volumen del ladrido:");
                        LadridoVolumen = sc.next();

                        Perro perrob = new Perro(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo), new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor, OjoDerechoTipo), new Ladrido(LadridoVolumen));
                        System.out.println("Hay " + corral.getPerro1(perrob).size());

                        for (Perro p : corral.getPerro1(perrob)) {
                            System.out.println(p);
                        }
                        break;

                    case 0:
                        System.out.println("Cerrando sistema");
                        repetir = false;
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }catch (Exception e){
                System.out.println("Opcion invalida");
                sc.nextLine();
            }
        }while (repetir);
    }
}