/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_ancapsulacion;

/**
 *
 * @author SENA
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Personas> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Personas("Esteban Osorio", 30));
        listaPersonas.add(new Personas("Miguel Angel", 35));
        listaPersonas.add(new Personas("Karen Hernandez", 40));

        for (Personas pep : listaPersonas) {
            pep.mostrarInfo();
            System.out.println("----------");
        }

        listaPersonas.get(1).setEdad(37);

        System.out.println("Información actualizacion de datos:");
        listaPersonas.get(1).mostrarInfo();
        listaPersonas.remove(0);
        System.out.println("\nEsta es la lista de personas que solicitan un trabajo en la empresa:");
        for (Personas pep : listaPersonas) {
            pep.mostrarInfo();
            System.out.println("----------");
        }
    }
}
