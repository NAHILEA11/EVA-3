/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_13_retum;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class EVA3_13_RETUM {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int va11 = captu.nextInt();
        System.out.println("Valor 2: ");
        int va12 = captu.nextInt ();
        //LLAMR A LA FUNCION/
        //1. Guardar el resuktado:
        int resu = sumar(va11, va12);
        System.out.println("La suma = " + resu);
        //2. Usar directamente el resultado de la funcion
        //cuando solo usa el resulktado una vez
        System.out.println("La suma = " + sumar(va11, va12));
        //3.Ignorar el resultado
        sumar(va11, va12);
    }
    
    public static int sumar(int num1, int num2) {
        int resu = num1 + num2;
        return resu; //Es la ultima instruccion del metodo
                     //despues del return no puede haber mas instrucciones
    }
}
