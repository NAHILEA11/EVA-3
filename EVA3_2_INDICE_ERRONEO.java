/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_indice_erroneo;

/**
 *
 * @author Nahilea
 */
public class EVA3_2_INDICE_ERRONEO {

    public static void main(String[] args) {
        //TODO code application logic here
        int datos[] = new int[10];
        datos[10] = 100;//ERROR EN TIEMPO DE EJECUCION: El indice 10 no existe
        System.out.println("El valor en datos[10] = " + datos[10]);
        
    }
}
