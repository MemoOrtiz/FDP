
//Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales. 
import java.util.Scanner;



public class U2P10
{
    public static void main (String[]args)
    {
        int entero;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de dos digitos");
        entero=escaner.nextInt();
        int num;
        int digito1;
        int digito2;
        num=Math.abs(entero);
        if (num>9&&num<100){
            digito1=num/10;
            digito2=num%10;
            if(digito1==digito2){
                System.out.println("Los 2 digitos son iguales");
            }else{
                System.out.println("Los 2 digitos no son iguales");
            }
        }else{
            System.out.println("Ingrese un numero entero de 2 digitos");
        }
    }
}