import java.util.Scanner;

//6. Leer un número entero de dos dígitos menor que 20 y determinar si es primo. 
public class U2P6
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de dos digitos menor que 20");
        num=escaner.nextInt();
        if (num>=10&&num<=19){
            if(num==11||num==13||num==17){
                System.out.println("Es numero primo");
            }else{
                System.out.println("No es un numero primo");
            }
        }else{
            System.out.println("Escribir un numero dentro del rango");
        }
    }
}