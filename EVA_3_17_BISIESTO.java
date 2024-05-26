/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA_3_17_BISIESTO {

    public static void main(String[] args) {
        //TODO code application logic here
       Scanner captu = new Scanner(System.in);
       System.out.println("año a evaluar ");
       int year = captu.nextInt();
       boolean resu = esBisiesto(year);
       if(resu == true)
           System.out.println("si es año bisiesto");
       else
           System.out.println("no es año bisiesto");
    }
    public static boolean esBisiesto(int year) {
        int resi4 = year % 4; 
        int resi100 = year % 100;
        int resi400 = year % 400;
        if ((resi4 == 0) && ((resi100 != 0) || (resi400 == 0)))
            return true;
        else
            return false;     
    }
        
                                                          
}
