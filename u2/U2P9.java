import java.util.Scanner;

//Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro 

public class U2P9
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
            if(digito1%digito2==0){
                System.out.println("Los 2 digitos son multiplos");
            }else{
                if(digito2%digito1==0){
                System.out.println("Los 2 digitos son multiplos");
                }else{
                System.out.println("Los 2 digitos no son multiplos");
            }
            }
            }else{
            System.out.println("Ingrese un numero a correcto rango");
            }
        }
    }
