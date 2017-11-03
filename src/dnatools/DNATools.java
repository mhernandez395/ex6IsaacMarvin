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
     * Contiene todas las letras referidas al ADN (a,c,g,t) en minúscula.
     */
    public static final String ADN = "acgt";
    
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
    
    /**
     * Funcion que cuenta un caracter en una cadena de String
     * @param caracter caracter que se va a contar
     * @param secuencia Secuencia de caracter
     * @return contador int numero de veces que aparece el caracter en la cadena.
     */
    public static int contarCaracter(char caracter, String secuencia){
        int contador = 0;
        char[] arrayChar = secuencia.toCharArray();
 
        for(int i=0; i<arrayChar.length; i++){
 
            if( arrayChar[i] == caracter){
                contador++;
            }				
            else{}
				
        }
        return contador;
    }
    
    
    
}
