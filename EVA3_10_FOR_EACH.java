/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_for_each;

/**
 *
 * @author Nahilea
 */
public class EVA3_10_FOR_EACH {

    public static void main(String[] args) {
        //TODO code application logic here
        String diasSemana[] = {"Domingo", "Lunes","Martes", "Miercoles", "Jueves", "Viernes","Sabado"};
        for (String dia : diasSemana) { 
            System.out.println(dia);
        }
        
        int salario [] ={30, 50, 25,35};
        for (int cant : salario) {
            System.out.println("$" + cant);
        }
        String mesAño [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Agosto","Septiembre","Noviembre","Diciembre"};
        for (String mes : mesAño) {
            System.out.println(mes);
        }
    }
}
