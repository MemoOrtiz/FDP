package Unidad3;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 * Leer un número entero de dos dígitos y determinar a cuánto 
 * es igual la suma de sus dígitos. 
 * @author (Guillermo Ortiz) 
 * @version (12/10/22)
 */
public class U3P4
{
    public static void main(String[]Args){
        Scanner escaner = new Scanner(System.in);
        int num1;
        int num2;
        int menor;
        int mayor;
        int seguir=-1;
        do{
            do{
                try{
                    System.out.println("Ingresa un numero entero");
                    num1 = escaner.nextInt();
                    System.out.println("Ingresa otro numero entero");
                    num2 = escaner.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("No ingrese letras");
                    escaner.nextLine();
                }
            }while(true);    
            if(num1<num2){
                menor=num1+1;
                mayor= num2-1;
                for(int cont= menor;cont<=mayor;cont++){
                    System.out.print(cont + ",");
                }
                System.out.println("\n");
                
            }else{
                menor=num2+1;
                mayor = num1-1;
                for(int cont= menor;cont<=mayor;cont++){
                    System.out.print(cont + ",");
                }
            }
            seguir=JOptionPane.showConfirmDialog(null, "Otra vez?");
        }while(seguir==0);
    }
}
