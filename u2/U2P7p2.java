 import java.util.Scanner;
//. Leer un número entero de dos dígitos y determinar si es primo y además si es negativo. 

public class U2P7p2
{
    public static void main (String[]args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Escribe un numero entero de 2 digitos");
        int num = x.nextInt();
        if (Math.abs(num)>=10 && Math.abs(num)<99){
        if(esprimo(num) && num >= 0)
            System.out.print("Es primo, y es numero positivo");
        else if(num >= 0)
            System.out.print("no es primo, y es numero positivo");
        else
            System.out.print("no es primo, y es numero negativo");
    }else{
        System.out.print("Escribir un numero de 2 digitos");
    }
    }
    public static boolean esprimo(int num) {
        boolean primo = true;
        for(int x = 2; x <num; x++) {
            if (num % x == 0 ) {
                primo = false;
            }
        }
        return primo;
    }
}

