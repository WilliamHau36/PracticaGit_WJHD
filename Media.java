
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch17
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calif;
        double sum =0;
        double baja = 9999;
        double media;
        for(int a =1;a <=9;a++){
            System.out.print("Teclee la calificacioón:  ");
            calif=scanner.nextDouble();
            sum=sum + calif;
            if(calif<baja){
                baja= calif;
                
            }
                
            }
            
        media= sum/9;
        System.out.println(" le media es: "+media);
        System.out.println("La calificación mas baja es:   "+baja);
        scanner.close();
             
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
