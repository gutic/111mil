/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author agustin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float nota = 0;
        float sumatoria = 0;
        int cant = 0;
        int horas = 0;
        /*for (int i = 1; i <= 10; i++) {
            System.out.print("ingrese las horas trabajadas \n");
            horas = teclado.nextInt();
            System.out.println("total a pagar al trabajador " + i + " es =  "  + horas*500);
        }
        */   
         System.out.print("ingrese la nota");
         nota = teclado.nextInt();
         
         while(nota != 0){
             System.out.print("ingrese la nota");
             if (nota >= 1 && nota <= 10){
                sumatoria += nota;
                cant +=1;
                nota = teclado.nextInt();
            }
            else{
                System.out.print("Dato invalido");
            }
        }
        System.out.print("El promedio es  =  " + sumatoria/cant);
                
    }
    
}
