import java.util.Scanner;
//Leer un entero y determinar si es un numero negativo

public class U2P3
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un entero");
        num=escaner.nextInt();
        if(num<0){
            System.out.println("Es numero negativo");
        }else{
            System.out.println("Es numero positivo");
        }
    }
}