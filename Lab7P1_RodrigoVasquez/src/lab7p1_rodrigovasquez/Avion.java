package lab7p1_rodrigovasquez;

import java.util.Scanner;

public class Avion {

    public String modelo;
    public String codigo;
    public int fabricacion;
    public int maxPasajeros;
    public double peso;
    public String nombreAerolinea;
    public int estado;

    public Avion(String modelo, String codigo, int fabricacion, int maxPasajeros, double peso, String nombreAerolinea, int estado) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.fabricacion = fabricacion;
        this.maxPasajeros = maxPasajeros;
        this.peso = peso;
        this.nombreAerolinea = nombreAerolinea;
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public int getEstado() {
        return estado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int avion1(Avion[] aviones, int estadoAvion1PR) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Se ha elegido el " + aviones[0].modelo + "---");
        System.out.println("");
        System.out.print("Estados disponibles:\n1. Despegando\n2. Aterrizando\n3. Estacionado\n\nIngrese el nuevo estado: ");
        int estadoAvion1LT = scan.nextInt();
        switch (estadoAvion1PR) {
            case 1:
                switch (estadoAvion1LT) {
                    case 1:
                        System.out.println("¡El avion ya está despegando!");
                        break;
                    case 2:
                        System.out.println("---" + aviones[0].modelo + " ahora está aterrizando---");
                        estadoAvion1PR = estadoAvion1LT;
                        return estadoAvion1PR;
                    case 3:
                        System.out.println("¡No puedes estacionarte sin haber aterrizado!");
                        break;
                }
                break;
            case 2:
                switch (estadoAvion1LT) {
                    case 1:
                        System.out.println("¡No puedes despegar sin habaer aterrizado primero!");
                        break;
                    case 2:
                        System.out.println("¡El avion ya está aterrizando!");
                        break;
                    case 3:
                        System.out.println("---" + aviones[0].modelo + " ahora se está estacionando---");
                        estadoAvion1PR = estadoAvion1LT;
                        return estadoAvion1PR;
                }
                break;
            case 3:
                switch (estadoAvion1LT) {
                    case 1:
                        System.out.println("---" + aviones[0].modelo + " ahora esta despegando---");
                        estadoAvion1PR = estadoAvion1LT;
                        return estadoAvion1PR;
                    case 2:
                        System.out.println("¡No puedes aterrizar sin haber despegado!");
                        break;
                    case 3:
                        System.out.println("¡El avion ya está estacionado!");
                        break;
                }
                break;
        }
        return 0; 
    }

    public static int estado(Avion[] aviones, int choiceAvion, int estadoAvion1PR, int estadoAvion2PR, int estadoAvion3PR, int estadoAvion1LT, int estadoAvion2LT, int estadoAvion3LT) {
        Scanner sevenEleven = new Scanner(System.in);
        switch (choiceAvion) {
            case 1:
                System.out.println("---Se ha elegido el " + aviones[0].modelo + "---");
                System.out.println("");
                System.out.print("Estados disponibles:\n1. Despegando\n2. Aterrizando\n3. Estacionado\n\nIngrese el nuevo estado: ");
                estadoAvion1LT = sevenEleven.nextInt();
                switch (estadoAvion1PR) {
                    case 1:
                        switch (estadoAvion1LT) {
                            case 1:
                                System.out.println("¡El avion ya está despegando!");
                                break;
                            case 2:
                                System.out.println("---" + aviones[0].modelo + " ahora está aterrizando---");
                                estadoAvion1PR = estadoAvion1LT;
                                return estadoAvion1PR;
                            case 3:
                                System.out.println("¡No puedes estacionarte sin haber aterrizado!");
                                break;
                        }
                        break;
                    case 2:
                        switch (estadoAvion1LT) {
                            case 1:
                                System.out.println("¡No puedes despegar sin habaer aterrizado primero!");
                                break;
                            case 2:
                                System.out.println("¡El avion ya está aterrizando!");
                                break;
                            case 3:
                                System.out.println("---" + aviones[0].modelo + " ahora se está estacionando---");
                                estadoAvion1PR = estadoAvion1LT;
                                return estadoAvion1PR;
                        }
                        break;
                    case 3:
                        switch (estadoAvion1LT) {
                            case 1:
                                System.out.println("---" + aviones[0].modelo + " ahora esta despegando---");
                                estadoAvion1PR = estadoAvion1LT;
                                return estadoAvion1PR;
                            case 2:
                                System.out.println("¡No puedes aterrizar sin haber despegado!");
                                break;
                            case 3:
                                System.out.println("¡El avion ya está estacionado!");
                                break;
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("---Se ha elegido el " + aviones[1].modelo + "---");
                System.out.println("");
                System.out.print("Estados disponibles:\n1. Despegando\n2. Aterrizando\n3. Estacionado\n\nIngrese el nuevo estado: ");
                estadoAvion2LT = sevenEleven.nextInt();
                switch (estadoAvion2PR) {
                    case 1:
                        switch (estadoAvion2LT) {
                            case 1:
                                System.out.println("¡El avion ya está despegando!");
                                break;
                            case 2:
                                System.out.println("---" + aviones[0].modelo + " ahora está aterrizando---");
                                return estadoAvion2PR = estadoAvion2LT;
                            case 3:
                                System.out.println("¡No puedes estacionarte sin haber aterrizado!");
                                break;
                        }
                        break;
                    case 2:
                        switch (estadoAvion2LT) {
                            case 1:
                                System.out.println("¡No puedes despegar sin habaer aterrizado primero!");
                                break;
                            case 2:
                                System.out.println("¡El avion ya está aterrizando!");
                                break;
                            case 3:
                                System.out.println("---" + aviones[0].modelo + " ahora se está estacionando---");
                                return estadoAvion2PR = estadoAvion2LT;
                        }
                        break;
                    case 3:
                        switch (estadoAvion2LT) {
                            case 1:
                                System.out.println("---" + aviones[0].modelo + " ahora esta despegando---");
                                return estadoAvion2PR = estadoAvion2LT;
                            case 2:
                                System.out.println("¡No puedes aterrizar sin haber despegado!");
                                break;
                            case 3:
                                System.out.println("¡El avion ya está estacionado!");
                                break;
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("---Se ha elegido el " + aviones[2].modelo + "---");
                System.out.println("");
                System.out.print("Estados disponibles:\n1. Despegando\n2. Aterrizando\n3. Estacionado\n\nIngrese el nuevo estado: ");
                estadoAvion3LT = sevenEleven.nextInt();
                switch (estadoAvion3PR) {
                    case 1:
                        switch (estadoAvion3LT) {
                            case 1:
                                System.out.println("¡El avion ya está despegando!");
                                break;
                            case 2:
                                System.out.println("---" + aviones[0].modelo + " ahora está aterrizando---");
                                return estadoAvion3PR = estadoAvion3LT;
                            case 3:
                                System.out.println("¡No puedes estacionarte sin haber aterrizado!");
                                break;
                        }
                        break;
                    case 2:
                        switch (estadoAvion3LT) {
                            case 1:
                                System.out.println("¡No puedes despegar sin habaer aterrizado primero!");
                                break;
                            case 2:
                                System.out.println("¡El avion ya está aterrizando!");
                                break;
                            case 3:
                                System.out.println("---" + aviones[0].modelo + " ahora se está estacionando---");
                                return estadoAvion3PR = estadoAvion3LT;
                        }
                        break;
                    case 3:
                        switch (estadoAvion3LT) {
                            case 1:
                                System.out.println("---" + aviones[0].modelo + " ahora esta despegando---");
                                return estadoAvion3PR = estadoAvion3LT;
                            case 2:
                                System.out.println("¡No puedes aterrizar sin haber despegado!");
                                break;
                            case 3:
                                System.out.println("¡El avion ya está estacionado!");
                                break;
                        }
                        break;
                }
                break;
            default:
                System.out.println("El numero es invalido");
                break;
        }
        return 0;
    }
}
