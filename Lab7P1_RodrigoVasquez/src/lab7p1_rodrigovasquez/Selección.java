package lab7p1_rodrigovasquez;

import java.util.Random;

public class Selección {

    public String nombreGrupo;
    public String nombreSeleccion;
    public String nombreTecnico;
    public int jugadores;
    public String ganadorMundial;
    public String posicion;
    public int goles;

    public Selección(String nombreGrupo, String nombreSeleccion, String nombreTecnico, int jugadores, String ganadorMundial, String posicion, int goles) {
        this.nombreGrupo = nombreGrupo;
        this.nombreSeleccion = nombreSeleccion;
        this.nombreTecnico = nombreTecnico;
        this.jugadores = jugadores;
        this.ganadorMundial = ganadorMundial;
        this.posicion = posicion;
        this.goles = goles;
    }

    public void setGoles(String equipo1, String equipo2) {
        System.out.println("Juega " + equipo1 + " contra " + equipo2);
        int goles1 = new Random().nextInt((5 - 0) + 1) + 0;
        int goles2 = new Random().nextInt((5 - 0) + 1) + 0;
        System.out.println(equipo1 + " " + goles1 + " - " + equipo2 + " " + goles2);
        if (goles1 > goles2) {
            System.out.println("¡Ha ganado " + equipo1 + "!");
        } else if (goles2 > goles1){
            System.out.println("¡Ha ganado " + equipo2 + "!");
        } else { 
            System.out.println("¡Empate!");
        }
    }

    @Override
    public String toString() {
        return nombreSeleccion + " pertenece al " + nombreGrupo + "\nSu Director Tecnico es " + nombreTecnico + "\nTiene " + jugadores + " jugadores convocados\n" + ganadorMundial + " ha ganado un mundial" + "\nEsta en la " + posicion + " posicion del grupo" + "\n---Se ha creado exitosamente la seleccion de " + nombreSeleccion + "---";
    }

}
