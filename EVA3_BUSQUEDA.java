/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_busqueda;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA3_BUSQUEDA {

    public static void main(String[] args) {
        int arreglo [] = new int [10];
        //Llenarlo con valores aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[1] = (int) (Math.random() *100) + 1;
        }
        //imprimirlo
        for (int i : arreglo) {
            System.out.print("[" +  arreglo + "]");
        }
        
        //PREGUNTAR AL USUARIO EL VALOR A BUSCAR
        Scanner captu = new Scanner(System.in);
        System.out.println("");
        System.out.println("¿Que valor buscar");
        int valor = captu.nextInt();
        
        //BUSCAR:
        //RECORRER EL ARREGLO(CICLO)
        //COMPARAR VALOR BUSCADO CONTRA EL VALOR EN EL ARREGLO (IF)
        //DETERNERME SI LO ENCUENTRO, SI NO, SEGUIR BUSCANDO
        //REGRESAR EL RESULTADO: PUEDE VARIAR > PUEDE SER LA POSICION
        //0 VERDADERA (SI LO ENCUENTRA) 0 FALSO {NO LO ENCUENTRA)
        
        int posi =-1; //una posicion que no existe
        
        for(int i = 0; i < arreglo.length; i++) {
            if(valor == arreglo[i]); {
        posi = i; //Almaceno la posicion donde esta el valor 
            break;
            
        }
            
        }
        System.out.println("posicion = "+ posi);
    }
}
