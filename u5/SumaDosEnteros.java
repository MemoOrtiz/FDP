import java.util.Scanner;

/**
 * Write a description of class SumaDosEnteros here.
 * Lee 2 enteros y llama con ellos una funcion sumar para mostrar el resultado
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumaDosEnteros
{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el primer entero: ");
        int num1= sc.nextInt();
        System.out.println("Ingresa el segundo entero: ");
        int num2= sc.nextInt();
        System.out.println("La suma es: " +sumar(num1,num2));
        
    }
    public static int sumar(int n1, int n2){
        return n1+n2;
    }
}
