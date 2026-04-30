
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch17
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int n = 1;n <=30;n++){
            System.out.print("Teclee el año de nacimiento:  ");
            int añonac=scanner.nextInt();
            System.out.print("Teclee el año actual:  ");
            int añoact=scanner.nextInt();
            int edad = añoact -añonac;
            System.out.println("La edad es:  "+edad);
            
        }
        scanner.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
