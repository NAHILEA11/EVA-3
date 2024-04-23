/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_practica1_arreglos;

/**
 *
 * @author Gerardo
 */
public class EVA3_PRACTICA1_ARREGLOS {

    public static void main(String[] args) {
        //TODO code application logic here
        //LOS ARREGLOS EM JAVA SON OBJETOS.
        //TENEMOS QUE CREARLOS ANTES DE USUARLOS
        //[] ---> manejar los indices: arreglo [3] acceso a la posicion
        //declaracion = creacion (new) [tamaño del arreglo]
        int arreglo[] = new int [1000];//un arreglo de 10 enteros
        //a traves de indices: 
        //conocer las posiciones de los valores:
        //PRIMER POSICION DE U ARREGLO ES CERO ----> 0
        //ULTIMA POSICION DE UN ARREGLO ES --> N -1, donde
        //N es el tamaño del arreglo
        arreglo[1] = 100;
        System.out.println("Valor de arreglo[1] = " + arreglo[1] );
        System.out.println(arreglo);
        System.out.println(arreglo.length); // lenth es la cantidad de elementos que nos dice como almacenar
        
               
    }
}
