package dnatools;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner

        //variables
        int option = 0;
        String sequence = "";

        System.out.println("Escribe una secuencia que contenga menos de 20 bases:");
        sequence = sc.next();
        if (DNATools.isADN(sequence)) {
            if (DNATools.isValidStringLength(sequence, 20)) {
                // Recuento de las bases.
                int a = DNATools.contarCaracter('a', sequence);
                int c = DNATools.contarCaracter('c', sequence);
                int g = DNATools.contarCaracter('g', sequence);
                int t = DNATools.contarCaracter('t', sequence);
                
                
                menu();
                option = Integer.parseInt(sc.next());
                while(option != 0) {
                    switch(option) {
                        case 1:
                            System.out.println(DNATools.reverseString(sequence));
                            break;
                        case 2:
                            //char baseMasRepetida = DNATools.baseMasRepetida(sequence);
                            //System.out.println( baseMasRepetida + " = " + DNATools.contarCaracter(baseMasRepetida, sequence));
                            break;
                        case 3:
                            //char baseMenosRepetida = DNATools.baseMenosRepetida(sequence);
                            //System.out.println( baseMenosRepetida + " = " + DNATools.contarCaracter(baseMenosRepetida, sequence));
                            break;
                        case 4:
                            System.out.println("A = " + a);
                            System.out.println("C = " + c);
                            System.out.println("G = " + g);
                            System.out.println("T = " + t);
                            System.out.println("Total :" + (a+c+g+t));
                            break;
                        default:
                            System.out.println("Opción incorrecta, porfavor introduce una opción valida.");
                            break;
                    }
                    menu();
                    option = Integer.parseInt(sc.next());
                }
                
            } else {
                System.out.println("Secuencia no valida! Por favor introduca menos de 20 bases.");
            }
        } else {
            System.out.println("Secuencia no valida! Las cadenas de ADN solo pueden contener 'a','c','g','t'.");
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
