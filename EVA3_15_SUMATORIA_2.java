/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_15_sumatoria_2;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class EVA3_15_SUMATORIA_2 {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        System.out.println("entero");
        int num1 = ver.nextInt();
        
        int resu = calcularSum(num1);
        System.out.println(resu);
    }
    public static int calcularSum(int base){
        int resu = 0;
        for (int i = 0; i < base; i++) {
            resu += i;
        }
        return resu;
    }
}
