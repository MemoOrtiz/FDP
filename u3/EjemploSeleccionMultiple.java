package Unidad3;
import java.util.Scanner;

/**
 * Leer un entero entre el 1 y 7 inclusive y mostrar el dia de la
 * semana correspondiente considerando lunes como 1 y domingo como 7 
 * @author (Guillermo Ortiz) 
 * @version (11/10/22)
 */
public class EjemploSeleccionMultiple
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un entero");
        int num;
        num = sc.nextInt();
        switch(num){
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miercoles");
                break;
            case 4: System.out.println("Jueves");
                break;
            case 5: System.out.println("Viernes");
                break;
            case 6: System.out.println("Sábado");
                break;
            case 7: System.out.println("Domingo");
                break;
            default: System.out.println("No es un día de la semana ");
        }
    }
}
