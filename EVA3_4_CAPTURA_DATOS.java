/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA3_4_CAPTURA_DATOS {

    public static void main(String[] args) {
        //TODO code application logic here
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantos nombres vas a capturar?");
        cant = captu.nextInt();
        String[] listaNombres = new String[cant];
        captu.nextLine();
        //HAY QUE PREGUNTAR CADA NOMBRE:
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Nombre #" + (i + 1) + ": ");
            listaNombres[i] = captu.nextLine();
        }
        
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println(listaNombres[i]);
            
        }
    }
}
