import java.util.Scanner;
//2. Leer un número entero y determinar si tiene 3 dígitos. 

public class U2P2
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un entero");
        num=escaner.nextInt();
        if(Math.abs(num)>99 && Math.abs(num)<1000){
            System.out.println("Si tiene 3 dígitos");
        }else{
            System.out.println("No tiene 3 dígitos");
        }
    }
}