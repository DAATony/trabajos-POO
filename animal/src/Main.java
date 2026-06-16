import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Corral corral = new Corral();
        Scanner sc = new Scanner(System.in);
        String Nombre,raza,Rabotipo,Rabocolor,LadridoVolumen,OjoIzquierdoColor,OjoIzquierdoTipo, OjoDerechoColor, OjoDerechoTipo,BuscarNom, MaullidoVolumen, CacareoVolumen;
        int edad, opc, opcP,N = 0;

        new Perro("coco","frenchpoodle",2, new Rabo("blanco","largo"),new Ojo("verde","grande"), new Ojo("verde","grande"),new Sonido("mediano"));

        corral.AgregarPerro(new Perro("alessandro","chihuahua",18,new Rabo("blanco","largo"),new Ojo("cafe","chino"),new Ojo("cafe","chino"),new Sonido("alto")));

        corral.AgregarPerro(new Perro("firulais","chihuahua",4,new Rabo("negro","largo"),new Ojo("verde","chino"),new Ojo("verde","chino"),new Sonido("mediano")));

        corral.AgregarPerro(new Perro("negrito","bulldog",6,new Rabo("negro","corto"),new Ojo("cafe","grande"),new Ojo("azul","grande"),new Sonido("bajo")));

        corral.AgregarPerro(new Perro("manchas","dalmata",9,new Rabo("blanco","corto"),new Ojo("blanco","grande"),new Ojo("cafe","grande"),new Sonido("bajo")));

        corral.AgregarPerro(new Perro("terry","frenchPuddle",10,new Rabo("blanco","corto"),new Ojo("azul","grande"),new Ojo("azul","grande"),new Sonido("alto")));

        corral.agregargato(new Gato("luna", "persa",3, new Rabo("blanco","largo"), new Ojo("azul","grande"), new Ojo("azul","grande"), new Sonido("bajo")));

        corral.agregargato(new Gato("tom", "slames",8, new Rabo("negro","largo"), new Ojo("gris","grande"), new Ojo("gris","grande"), new Sonido("alto")));

        corral.AgregarGallina(new Gallina("copete", "ponedora",3, new Rabo("blanco","corto"), new Ojo("cafe","pequeño"), new Ojo("cafe","pequeño"), new Sonido("alto")));

        corral.AgregarGallina(new Gallina("mario", "ornamental",6, new Rabo("blanco","corto"), new Ojo("cafe","pequeño"), new Ojo("cafe","pequeño"), new Sonido("alto")));

        boolean repetir = true;

        do {
            System.out.println("--------------------------");
            System.out.println("Elige el animal a elegir");
            System.out.println("1- Perro");
            System.out.println("2- Gato");
            System.out.println("3- Gallina");
            System.out.println("4- Salir");
            System.out.println("---------------------------");

            try {

                opc = sc.nextInt();

                switch (opc) {

                    case 1:

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
                        System.out.println("9-Suma y promedio de las edades de los perros");
                        System.out.println("0-Salir");
                        System.out.println("---------------------------------");

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

                                corral.AgregarPerro(new Perro(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo),
                                        new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor,
                                        OjoDerechoTipo), new Sonido(LadridoVolumen)));

                                break;

                            case 2:
                                for (Perro p : corral.getPerros) {
                                    N++;
                                    System.out.println("Perro " + N);
                                    System.out.println(p);
                                }
                                break;

                            case 3:
                                System.out.println("Perros en el corral: " + corral.getPerros.size() + "\n");
                                break;

                            case 4:
                                System.out.println("El perro mas viejo es: \n" + corral.getPerroMayor());
                                break;

                            case 5:
                                System.out.println("Ingresa el nombre del perro a buscar:");
                                BuscarNom = sc.next();
                                System.out.println("Los perros llamados " + BuscarNom + " son:");
                                for (Perro p : corral.getNombreP(BuscarNom)) {

                                    System.out.println(p);
                                }
                                break;

                            case 6:
                                System.out.println("Los perros con ojos azules son:");
                                if (!corral.getOjosAzulP().isEmpty()) {
                                    for (Perro p : corral.getOjosAzulP()) {

                                        System.out.println(p);
                                    }
                                } else {
                                    System.out.println("No hay");
                                }
                                break;

                            case 7:
                                System.out.println("Los perros con el volumen alto son:");
                                if (!corral.getVolumenAltoP().isEmpty()) {
                                    for (Perro p : corral.getVolumenAltoP()) {
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

                                Perro perrob = new Perro(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo), new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor, OjoDerechoTipo), new Sonido(LadridoVolumen));
                                System.out.println("Hay " + corral.getPerro1(perrob).size());

                                for (Perro p : corral.getPerro1(perrob)) {
                                    System.out.println(p);
                                }
                                break;

                            case 9:

                                if(corral.getPerros.size() > 0) {
                                    System.out.println("La suma de edades de los perros es:");
                                    System.out.println(corral.getSumaEdadesP());
                                    System.out.println("El promedio es de:");
                                    System.out.println(corral.getSumaEdadesP() / corral.getPerros.size());
                                } else {
                                System.out.println("Error: No hay perros en el corral");
                                }
                                break;

                            case 0:

                                System.out.println("Regresando");
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                        break;

                    case 2:

                        System.out.println("---------------------------------");
                        System.out.println("Elije la opcion deseada:");
                        System.out.println("1-Agregar gato");
                        System.out.println("2-Lista de gatos");
                        System.out.println("3-Numero de gatos en el corral");
                        System.out.println("4-Gato de mayor edad");
                        System.out.println("5-Gatos llamados luna");
                        System.out.println("6-Gatos con los ojos azules");
                        System.out.println("7-Gatos con Ladrido alto");
                        System.out.println("8-Gatos repetidos");
                        System.out.println("9-Suma y promedio de las edades de los gatos");
                        System.out.println("0-Salir");
                        System.out.println("---------------------------------");

                        opcP = sc.nextInt();

                        switch (opcP) {

                            case 1:
                                System.out.println("Escribe el nombre del gato:");
                                Nombre = sc.next();

                                System.out.println("Escribe la raza del gato:");
                                raza = sc.next();

                                System.out.println("Ingresa la edad del gato:");
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

                                System.out.println("Ingresa el volumen del maullido:");
                                MaullidoVolumen = sc.next();

                                corral.agregargato(new Gato(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo),
                                        new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor,
                                        OjoDerechoTipo), new Sonido(MaullidoVolumen)));

                                break;

                            case 2:
                                for (Animal p : corral.getGatos) {
                                    N++;
                                    System.out.println("Gato " + N);
                                    System.out.println(p);
                                }
                                break;

                            case 3:
                                System.out.println("Gatos en el corral: " + corral.getGatos.size() + "\n");
                                break;

                            case 4:
                                System.out.println("El gato mas viejo es: \n" + corral.getGatoMayor());
                                break;

                            case 5:
                                System.out.println("Ingresa el nombre del gato a buscar:");
                                BuscarNom = sc.next();
                                System.out.println("Los gatos llamados " + BuscarNom + " son:");
                                for (Gato p : corral.getNombreG(BuscarNom)) {

                                    System.out.println(p);
                                }
                                break;

                            case 6:
                                System.out.println("Los gatos con ojos azules son:");
                                if (!corral.getOjosAzulG().isEmpty()) {
                                    for (Gato p : corral.getOjosAzulG()) {

                                        System.out.println();
                                    }
                                } else {
                                    System.out.println("No hay");
                                }
                                break;

                            case 7:
                                System.out.println("Los gatos con el volumen alto son:");
                                if (!corral.getVolumenAltoG().isEmpty()) {
                                    for (Animal p : corral.getVolumenAltoG()) {
                                        System.out.println(p);
                                    }
                                } else {
                                    System.out.println("No hay");
                                }
                                break;

                            case 8:

                                System.out.println("Ingresa los datos del gato a buscar");

                                System.out.println("Escribe el nombre del gato:");
                                Nombre = sc.next();

                                System.out.println("Escribe la raza del gato:");
                                raza = sc.next();

                                System.out.println("Ingresa la edad del gato:");
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

                                System.out.println("Ingresa el volumen del moullido:");
                                MaullidoVolumen = sc.next();

                                Gato gato = new Gato(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo), new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor, OjoDerechoTipo), new Sonido(MaullidoVolumen));
                                System.out.println("Hay " + corral.getGato1(gato).size());

                                for (Gato p : corral.getGato1(gato)) {
                                    System.out.println(p);
                                }
                                break;

                            case 9:

                                if(corral.getGatos.size() > 0) {
                                    System.out.println("La suma de edades de los gatos es:");
                                    System.out.println(corral.getSumaEdadesG());
                                    System.out.println("El promedio es de:");
                                    System.out.println(corral.getSumaEdadesG() / corral.getGatos.size());
                                }else {
                                    System.out.println("Error: No hay gatos es el corral");
                                }
                                break;

                            case 0:
                                System.out.println("Regresando");

                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                        break;

                    case 3:

                        System.out.println("---------------------------------");
                        System.out.println("Elije la opcion deseada:");
                        System.out.println("1-Agregar gallina");
                        System.out.println("2-Lista de gallinas");
                        System.out.println("3-Numero de gallinas en el corral");
                        System.out.println("4-Gallina de mayor edad");
                        System.out.println("5-Gallinas llamadas copete");
                        System.out.println("6-Gallinas con los ojos azules");
                        System.out.println("7-Gallinas con cacareo alto");
                        System.out.println("8-Gallinas repetidas");
                        System.out.println("9-Suma y promedio de las edades de las gallinas");
                        System.out.println("0-Salir");
                        System.out.println("---------------------------------");

                        opcP = sc.nextInt();

                        switch (opcP) {

                            case 1:
                                System.out.println("Escribe el nombre de la gallina:");
                                Nombre = sc.next();

                                System.out.println("Escribe la raza de la gallina:");
                                raza = sc.next();

                                System.out.println("Ingresa la edad de la gallina:");
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

                                System.out.println("Ingresa el volumen del cacareo:");
                                CacareoVolumen = sc.next();

                                corral.AgregarGallina(new Gallina(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo),
                                        new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor,
                                        OjoDerechoTipo), new Sonido(CacareoVolumen)));

                                break;

                            case 2:
                                for (Gallina p : corral.getGallinas) {
                                    N++;
                                    System.out.println("Gallina " + N);
                                    System.out.println(p);
                                }
                                break;

                            case 3:
                                System.out.println("Gallinas en el corral: " + corral.getGallinas.size() + "\n");
                                break;

                            case 4:
                                System.out.println("La gallina mas vieja es: \n" + corral.getGallinaMayor());
                                break;

                            case 5:
                                System.out.println("Ingresa el nombre de la gallina a buscar:");
                                BuscarNom = sc.next();
                                System.out.println("Las gallinas llamadas " + BuscarNom + " son:");
                                for (Gallina p : corral.getNombreO(BuscarNom)) {

                                    System.out.println(p);
                                }
                                break;

                            case 6:
                                System.out.println("Las gallinas con ojos azules son:");
                                if (!corral.getOjosAzulO().isEmpty()) {
                                    for (Gallina p : corral.getOjosAzulO()) {

                                        System.out.println(p);
                                    }
                                } else {
                                    System.out.println("No hay");
                                }
                                break;

                            case 7:
                                System.out.println("Las gallinas con el volumen alto son:");
                                if (!corral.getVolumenAltoO().isEmpty()) {
                                    for (Gallina p : corral.getVolumenAltoO()) {
                                        System.out.println(p);
                                    }
                                } else {
                                    System.out.println("No hay");
                                }
                                break;

                            case 8:

                                System.out.println("Ingresa los datos de la gallina a buscar");

                                System.out.println("Escribe el nombre de la gallina:");
                                Nombre = sc.next();

                                System.out.println("Escribe la raza de la gallina:");
                                raza = sc.next();

                                System.out.println("Ingresa la edad de la gallina:");
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

                                System.out.println("Ingresa el volumen del cacareo:");
                                CacareoVolumen = sc.next();

                                Gallina gallina = new Gallina(Nombre, raza, edad, new Rabo(Rabocolor, Rabotipo), new Ojo(OjoIzquierdoColor, OjoIzquierdoTipo), new Ojo(OjoDerechoColor, OjoDerechoTipo), new Sonido(CacareoVolumen));
                                System.out.println("Hay " + corral.getGallina1(gallina).size());

                                for (Gallina p : corral.getGallina1(gallina)) {
                                    System.out.println(p);
                                }
                                break;

                            case 9:

                                if(corral.getGallinas.size() > 0) {
                                    System.out.println("La suma de edades de las gallinas es:");
                                    System.out.println(corral.getSumaEdadesO());
                                    System.out.println("El promedio es de:");
                                    System.out.println(corral.getSumaEdadesO() / corral.getGallinas.size());
                                }else {
                                    System.out.println("Error: No hay gallinas en el corral");
                                }
                                break;

                            case 0:
                                System.out.println("Regresando");

                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                        break;

                    case 4:
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