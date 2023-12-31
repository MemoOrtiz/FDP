package Unidad3;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Leer un número entero y mostrar todos los divisores exactos 
 * del número, comprendidos entre 1 y el número leído.  
 * @author (Guillermo Ortiz) 
 * @version (10/10/22)
 */
public class U3P3
{
    public static void main(String[]Args){
        Scanner escaner = new Scanner(System.in);
        int num=0;
        int salida;
        int seguir=-1;
        do{
            do{
                try{
                    System.out.println("Ingresa un numero entero positivo");
                    num = escaner.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("No ingrese letras");
                    escaner.nextLine();
                }
            }while(true);    
            if(num>0){
                for(int cont=2;cont<=num;cont++){
                    salida=num%cont;
                    if(salida==0){
                        System.out.print(cont + ",");
                    }
                }
                System.out.println("\n");

            }
            seguir=JOptionPane.showConfirmDialog(null, "Otra vez?");
        }while(seguir==0);
    }
}
