import java.util.Scanner;

//4. Leer un número entero de dos dígitos y determinar a cuánto es igual la suma de sus dígitos. 

public class U2P4
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de dos digitos");
        num=escaner.nextInt();
        int digito1;
        int digito2;
        int suma;
        if (Math.abs(num)>=10 && Math.abs(num)<=99){
            digito1= (num/10);
            digito2= num % 10;
            suma= digito1+digito2;
            System.out.println("La suma total de los dos digitos es de: "+ suma);
        }else{
            System.out.println("Ingrese nuevamente un numero correcto");
        }
    }
}   
