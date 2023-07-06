package Unidad3;
import java.util.Scanner;

public class U3P21_2
{
    public static void main(String[]Args){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingresa un entero");
        int numero = escaner.nextInt();
        int residuo;
        int suma=0;

        while(numero>=1){
            residuo=numero%10;
            suma=suma+residuo;
            numero=numero/10;
        }

        System.out.println("La suma es: " +suma);
    }
}
