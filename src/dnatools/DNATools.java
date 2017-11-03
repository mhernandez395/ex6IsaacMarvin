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
    System.out.println(reverseString("Hola me llamo Isaac."));
    System.out.println("Escribe una secuencia que contenga menos de 20 bases:");
    secuencia = sc.next();
    
        if (secuencia.length() <= 20) {
            
        } else {
            System.out.println("Secuencia no valida! POr favor introduca menos de 20 bases");
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
    
    /**
     * Invierte la cadena de texto recibida por parametros.
     * @param string String Cadena de texto a invertir.
     * @return String Cadena de texto invertida.
     */
    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        return sb.reverse().toString();
    }
    
    /**
     * Valida si la cadena recibida por parámetros (ya sea en mayúscula o en minúscula) es de ADN.
     * @param adn String Cadena a validar.
     * @return boolean Verdadero en caso de que la cadena contenga solo caracteres de ADN. Falso en caso en que la cantena contenga uno o mas caracteres que no sean de ADN.
     */
    public static boolean isADN(String adn) {
        String ADN = "acgt";
        adn = adn.toLowerCase();
        boolean isADN = true;
        for(char nucleotid : adn.toCharArray()) {
            if(!ADN.contains(String.valueOf(nucleotid))) {
                isADN = false;
                break;
            }
        }
        return isADN;
    }
    
    /**
     * Valida si la cadena recibida por parámetros tiene una longitud valida recibida por parametros.
     * @param string String Cadena a validar.
     * @param maxLength int Numero que determina el máximo de caracteres que puede tener la cadena.
     * @return true en caso de que la cadena contenga un numero inferior de caracteres que el maximo establecido por maxLength, falso en caso en el que los supere.
     */
    public static boolean isValidStringLength(String string, int maxLength) {
        return string.length() < maxLength;
    }
}
