import java.util.Scanner;

//Leer un número entero de tres dígitos y  
//determinar a cuánto es igual la suma de sus dígitos.

public class U2P15
{
    public static void main (String[]args)
    {
        int numero;
        Scanner x = new Scanner(System.in);
        System.out.println("Escribe un numero entero de 3 digitos ");
        numero = x.nextInt();
        int digito1;
        int digito2;
        int digito3;
        int suma;
        suma=0;
        digito1=numero/100;
        digito2=numero%100/10;
        digito3=numero%100%10;
        if(Math.abs(numero)>99&&Math.abs(numero)<=999){
            suma=digito1+digito2+digito3;
            System.out.println("La suma de los 3 digitos es: "+suma);
        }else{
            System.out.println("Ingrese un numero entero de 3 digitos");
        }
    }
}