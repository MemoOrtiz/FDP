
//. Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos 
 
import java.util.Scanner;

public class U2P8
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de dos digitos");
        num=escaner.nextInt();
        int entero;
        int digito1;
        int digito2;
        entero=Math.abs(num);
        if (num>=10 &&num<=99){
            digito1=num/10;
            digito2=num%10;
              boolean primo1 = true;
        for(int x = 2; x <digito1; x++) {
            if (digito1 % x == 0 ) {
                primo1 = false;
            }
        }
          boolean primo2 = true;
        for(int x = 2; x <digito2; x++) {
            if (digito2 % x == 0 ) {
                primo2 = false;
            }
        }
            if (primo1&&primo2){
                System.out.println("ambos digitos son primos");
            }else{
                System.out.println("Ambos digitos no son primos");
            }
        }else{
            System.out.println("Ingrese numero de 2 digitos");
        }
    }
}
            