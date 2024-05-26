/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_19_sumar;

/**
 *
 * @author nahilea
 */
public class EVA3_19_sumar {

    public static void sumarUno(int valor){
        System.out.println("Antes de la operacion, valor: "+ valor);
        valor = valor +1;
         System.out.println("Despues de la operacion. valor: "+ valor);
   
}
    public static void modificarArreglo (int [] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int) (Math.random() * 100);
        }
    }
}
