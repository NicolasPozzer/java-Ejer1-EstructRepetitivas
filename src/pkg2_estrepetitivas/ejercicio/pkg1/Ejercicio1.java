package pkg2_estrepetitivas.ejercicio.pkg1;

import java.util.Scanner;



public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int limite;
        
        System.out.println("Ingrese el limite a recorrer: ");
        Scanner teclado = new Scanner(System.in);
        limite = teclado.nextInt();
        
        
        
        
        for (int numero = 1; numero <= limite; numero++){
            
            System.out.println("Numero: " + numero + " de: " + limite);
            
        }
        
        
        
        
    }
    
}
