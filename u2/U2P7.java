
//. Leer un número entero de dos dígitos y determinar si es primo y además si es negativo. 
import java.util.Scanner;

public class U2P7
{
    public static void main (String[]args)
    {
        int num;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de dos digitos");
        num=escaner.nextInt();
        if (Math.abs(num)>=10 && Math.abs(num)<=99){
            if(num>0){
            if(num==2||num==3 || num==5 || num==7 || num==11 || num==13 || num==17 || num==19 || num==23 || num==29|| num==31|| num==37|| num==41|| num==43|| num==47|| num==53|| num==59|| num==61|| num==67|| num==71|| num==73|| num==79|| num==83|| num==89|| num==97) {
                System.out.println("Es numero primo, no negativo");
            }else{
                System.out.println("No es numero primo. no negativo");
            }
        }else{
            System.out.println("Es negativo");
        }
        }else{
            System.out.println("Escribir numero de 2 digitos");
        }
    }
}
