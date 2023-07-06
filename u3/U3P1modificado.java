
package Unidad3;

import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 * Leer un numero entero y mostrar todos los enteros desde 1 
 * hasta el numero leido
 * 
 * @author (Guillermo Ortiz) 
 * @version (05/10/22)
 */
public class U3P1modificado
{
    public static void main(String[]Args){
        Scanner escaner = new Scanner(System.in);
        int num=0;
        int seguir=-1;
        do{
            do{
                try{
                    System.out.println("Ingresa un entero");
                    num = escaner.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("No ingrese letras");
                    escaner.nextLine();
                }
            }while(true);    
            if(num>0){
                for(int cont=1;cont<=num;cont++){
                    System.out.print(cont + ",");
                }
                System.out.println("\n");
                
            }
            seguir=JOptionPane.showConfirmDialog(null, "Otra vez?");
        }while(seguir==0);
    }
}