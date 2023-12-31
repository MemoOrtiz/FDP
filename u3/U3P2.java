package Unidad3;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 * . Leer un número entero y mostrar todos 
 * los impares entre 1 y el número leído, inclusive.  
 * @author (Guillermo Ortiz) 
 * @version (10/10/22)
 */
public class U3P2
{
    public static void main (String[]Args){
        Scanner escaner = new Scanner(System.in);
        int num;
        int salida;
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
                    salida=cont%2;
                    if(salida==1){
                        System.out.print(cont + ",");
                    }
                }
                System.out.println("\n");

            }else{
                
            }
            seguir=JOptionPane.showConfirmDialog(null, "Otra vez?");
        }while(seguir==0);
    }
}
