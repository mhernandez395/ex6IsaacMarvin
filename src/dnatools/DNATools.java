/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnatools;

import java.util.Scanner;



/**
 *
 * @author Isaac y Marvin
 * @version 1.0 31.10.17
 */
public class DNATools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
    
    //variables
    int option = 0;
    String secuencia = "";
    
    System.out.println("Escribe una secuencia que contenga menos de 20 bases:");
    secuencia = sc.next();
    
        if (secuencia.length() <= 20) {
            
        } else {
            System.out.println("Secuencia no valida! POr favor introduca menos de 20 bases.");
        }
        
    }
    
    public static void menu(){
        System.out.println("Opciones:");
        System.out.println("1) Dar la vuelta a la cadena.");
        System.out.println("2) Encontrar base mas repetida.");
        System.out.println("3) Encontar base menos repetida.");
        System.out.println("4) Recuento de las bases.");
        System.out.println("0) salir");
    }
    
    
    
}
