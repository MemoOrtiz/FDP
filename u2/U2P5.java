
import java.util.Scanner;

//5. Leer un número entero de dos dígitos y determinar si ambos dígitos son pares. 

public class U2P5
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de dos digitos");
        num=escaner.nextInt();
        int digito1;
        int digito2;
        if (Math.abs(num)>=10 && Math.abs(num)<=99){
            digito1=num/10;
            digito2=num%10;
        if (digito1 % 2==0 && digito2 % 2==0){
            System.out.println("Ambos digitos son pares");
        
        }else{
            System.out.println("Al menos un digito no es par");
        }
        }
    }
}

        
        