import java.util.Scanner;
//1. Leer un número entero y determinar si es un número terminado en 4. 


public class U2P1
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un entero");
        
        num = escaner.nextInt();
        if (num%10 == 4 || num%10==-4){
            System.out.println("Si termina en 4");
        }else{
            System.out.println("No termina en 4");
        }
    }
}
    
