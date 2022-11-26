package lab7p1_rodrigovasquez;

import java.util.Scanner;

public class Lab7P1_RodrigoVasquez {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner touhou = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("---------------------------------");
            System.out.println("1. Calamar Pablo\n2. Torre de Control\n3. Salir");
            System.out.println("---------------------------------");
            System.out.print("Ingrese que ejercicio ejecutar: ");
            choice = touhou.nextInt();
            switch (choice) {
                case 1:
                    Mundial();
                    break;
                case 2:
                    torreControl();
                    break;
            }
        } while (choice != 3 || choice == 1 || choice == 2);
    }

    public static void Mundial() {
        Scanner runnin = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("¡ B I E N V E N I D O S   A L   M U N D I A L !");
        System.out.print("Ingrese el nombre de la selección: ");
        String seleccion = runnin.nextLine();
        String pais = seleccion.toLowerCase();
        int contP1 = 0;
        int contP2 = 0;
        switch (pais) {
            case "espana":
                Selección españa = new Selección("Grupo E", seleccion, "Luis Enrique", 26, "Si", "primera", 0);
                System.out.println(españa.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            españa.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            españa.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            españa.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            españa.setGoles(equipo1, equipo2);
                            break;
                    }
                }
                break;
            case "alemania":
                Selección alemania = new Selección("Grupo E", seleccion, "Hansi Flick", 26, "Si", "tercera", 0);
                System.out.println(alemania.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            alemania.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            alemania.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            alemania.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            alemania.setGoles(equipo1, equipo2);
                            break;
                    }
                }
                break;
            case "costa rica":
                Selección costaRica = new Selección("Grupo E", seleccion, "Luis Fernando Suarez", 26, "No", "cuarta", 0);
                System.out.println(costaRica.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            costaRica.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            costaRica.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            costaRica.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            costaRica.setGoles(equipo1, equipo2);
                            break;
                    }
                }
                break;
            case "japon":
                Selección japon = new Selección("Grupo E", seleccion, "Hajime Moriyasu", 26, "No", "segunda", 0);
                System.out.println(japon.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            japon.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            japon.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            japon.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            japon.setGoles(equipo1, equipo2);
                            break;
                    }
                }
                break;
            case "belgica":
                Selección belgica = new Selección("Grupo F", seleccion, "Roberto Martínez", 26, "No", "primera", 0);
                System.out.println(belgica.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            belgica.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            belgica.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            belgica.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            belgica.setGoles(equipo1, equipo2);
                            break;
                    }
                }
                break;
            case "croacia":
                Selección croacia = new Selección("Grupo F", seleccion, "Zlatko Dalić", 26, "No", "segunda", 0);
                System.out.println(croacia.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            croacia.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            croacia.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            croacia.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            croacia.setGoles(equipo1, equipo2);
                            break;
                    }
                }
                break;
            case "canada":
                Selección canada = new Selección("Grupo F", seleccion, "John Herdman", 26, "No", "cuarta", 0);
                System.out.println(canada.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            canada.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            canada.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            canada.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            canada.setGoles(equipo1, equipo2);
                            break;

                    }
                }
                break;
            case "marruecos":
                Selección marruecos = new Selección("Grupo F", seleccion, "Walid Regragui", 26, "No", "tercera", 0);
                System.out.println(marruecos.toString());
                for (int i = 0; i < 4; i++) {
                    switch (i) {
                        case 0:
                            String equipo1 = "Japon";
                            String equipo2 = "Costa Rica";
                            marruecos.setGoles(equipo1, equipo2);
                            break;
                        case 1:
                            equipo1 = "Belgica";
                            equipo2 = "Marruecos";
                            marruecos.setGoles(equipo1, equipo2);
                            break;
                        case 2:
                            equipo1 = "Croacia";
                            equipo2 = "Canada";
                            marruecos.setGoles(equipo1, equipo2);
                            break;
                        case 3:
                            equipo1 = "España";
                            equipo2 = "Alemania";
                            marruecos.setGoles(equipo1, equipo2);
                            break;
                    }
                }
                break;
        }
    }

    public static void torreControl() {
        Scanner sevenEleven = new Scanner(System.in);
        int contAviones = 0;
        Avion[] aviones = new Avion[3];
        do {
            if (contAviones == 0) {
                System.out.println("--Bienvenido al nuevo sistema de torre de control--");
            }
            switch (contAviones) {
                case 0:
                    System.out.print("Ingrese el modelo del avion: ");
                    String modelo1 = sevenEleven.nextLine();
                    System.out.print("Ingrese el codigo: ");
                    String codigo1 = sevenEleven.nextLine();
                    System.out.print("Ingrese el año de fabricacion: ");
                    int fabricacion1 = sevenEleven.nextInt();
                    System.out.print("Ingrese la capacidad maxima de pasajeros: ");
                    int maxPasajeros1 = sevenEleven.nextInt();
                    System.out.print("Ingrese el peso del avion: ");
                    double peso1 = sevenEleven.nextInt();
                    System.out.print("Ingrese el nombre de la aerolinea: ");
                    String nombreAerolinea1 = sevenEleven.nextLine();
                    nombreAerolinea1 = sevenEleven.nextLine();
                    System.out.print("Ingrese el estado del avion [1 = despegando, 2 = aterrizando, 3 = estacionado]: ");
                    int estado = sevenEleven.nextInt();
                    System.out.println("--Se ha agregado el avion exitosamente--");
                    aviones[0] = new Avion(modelo1, codigo1, fabricacion1, maxPasajeros1, peso1, nombreAerolinea1, estado);
                    contAviones++;
                    break;
                case 1:
                    System.out.print("Ingrese el modelo del avion: ");
                    String modelo2 = sevenEleven.nextLine();
                    modelo2 = sevenEleven.nextLine();
                    System.out.print("Ingrese el codigo: ");
                    String codigo2 = sevenEleven.nextLine();
                    System.out.print("Ingrese el año de fabricacion: ");
                    int fabricacion2 = sevenEleven.nextInt();
                    System.out.print("Ingrese la capacidad maxima de pasajeros: ");
                    int maxPasajeros2 = sevenEleven.nextInt();
                    System.out.print("Ingrese el peso del avion: ");
                    double peso2 = sevenEleven.nextInt();
                    System.out.print("Ingrese el nombre de la aerolinea: ");
                    String nombreAerolinea2 = sevenEleven.nextLine();
                    nombreAerolinea2 = sevenEleven.nextLine();
                    System.out.print("Ingrese el estado del avion [1 = despegando, 2 = aterrizando, 3 = estacionado]: ");
                    estado = sevenEleven.nextInt();
                    System.out.println("--Se ha agregado el avion exitosamente--");
                    aviones[1] = new Avion(modelo2, codigo2, fabricacion2, maxPasajeros2, peso2, nombreAerolinea2, estado);
                    contAviones++;
                    break;
                case 2:
                    System.out.print("Ingrese el modelo del avion: ");
                    String modelo3 = sevenEleven.nextLine();
                    modelo3 = sevenEleven.nextLine();
                    System.out.print("Ingrese el codigo: ");
                    String codigo3 = sevenEleven.nextLine();
                    System.out.print("Ingrese el año de fabricacion: ");
                    int fabricacion3 = sevenEleven.nextInt();
                    System.out.print("Ingrese la capacidad maxima de pasajeros: ");
                    int maxPasajeros3 = sevenEleven.nextInt();
                    System.out.print("Ingrese el peso del avion: ");
                    double peso3 = sevenEleven.nextInt();
                    System.out.print("Ingrese el nombre de la aerolinea: ");
                    String nombreAerolinea3 = sevenEleven.nextLine();
                    nombreAerolinea3 = sevenEleven.nextLine();
                    System.out.print("Ingrese el estado del avion [1 = despegando, 2 = aterrizando, 3 = estacionado]: ");
                    estado = sevenEleven.nextInt();
                    System.out.print("--Se ha agregado el avion exitosamente--");
                    aviones[2] = new Avion(modelo3, codigo3, fabricacion3, maxPasajeros3, peso3, nombreAerolinea3, estado);
                    contAviones++;
                    break;
            }
        } while (contAviones < 3);
        String choice = "";
        int estadoAvion1PR = aviones[0].estado;
        int estadoAvion2PR = aviones[1].estado;
        int estadoAvion3PR = aviones[2].estado;
        do {
            System.out.print("¿Desea cambiarle el estado a un avion? [S/N]: ");
            choice = sevenEleven.next();
            if (choice.equals("s") || choice.equals("S")) {
                System.out.println("Aviones disponibles:\n1. " + aviones[0].modelo + "\n2. " + aviones[1].modelo + "\n3. " + aviones[2].modelo + "\nIngrese el numero del avion al que le desea cambiar el estado: ");
                int choiceAvion = sevenEleven.nextInt();
                switch (choiceAvion) {
                    case 1:
                        System.out.println(aviones[0].avion1(aviones, estadoAvion1PR));
                        estadoAvion1PR = aviones[0].avion1(aviones, estadoAvion1PR);
                        break;
                    case 2:
                        System.out.println(aviones[1].avion1(aviones, estadoAvion2PR));
                        estadoAvion2PR = aviones[1].avion1(aviones, estadoAvion2PR);
                        break;
                    case 3:
                        System.out.println(aviones[2].avion1(aviones, estadoAvion3PR));
                        estadoAvion3PR = aviones[2].avion1(aviones, estadoAvion3PR);
                        break;
                    default:
                        System.out.println("Numero invalido");
                }
            }
        } while (choice.equals("s") || choice.equals("S"));
    }
}
