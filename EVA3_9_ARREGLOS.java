/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_arreglos;

/**
 *
 * @author Nahilea
 */
public class EVA3_9_ARREGLOS {

    public static void main(String[] args) {
        //TODO code application logic here
        String diasSemana[]= {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        char vocales[] = {'a','e','i','o','u'};
        System.out.println("Tamaño del arreglo diasSemana =" + diasSemana.length);
        System.out.println("Tamaño del arreglo diasSemana =" + vocales.length);
        
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana [i]);
        }
        System.out.println("");
        String menu [] = {"Archivo", "Nueva Factura", "Modificar","Salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println( i + " - " + menu [i]);
        }
;    }
}
