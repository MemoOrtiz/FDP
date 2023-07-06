package Unidad3;
import java.util.Scanner;


/**
 * Leer un numero entero y mostrar todos los enteros desde 1 
 * hasta el numero leido
 * 
 * @author (Guillermo Ortiz) 
 * @version (05/10/22)
 */
public class U3P1
{
    public static void main(String[]Args){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingresa un entero");
        int num = escaner.nextInt();
        if(num>0){
            for(int cont=1;cont<=num;cont++){
                System.out.print(cont + ",");
            }
        }
    }
}
