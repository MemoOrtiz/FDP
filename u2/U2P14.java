import java.util.Scanner;

//Leer dos números enteros de dos dígitos y 
//determinar a cuánto es igual la suma de todos los dígitos.  

public class U2P14
{
    public static void main (String[]args)
    {
        int numero1;
        Scanner x = new Scanner(System.in);
        System.out.println("Escribe un numero entero de 2 digitos ");
        numero1 = x.nextInt();
        int numero2;
        System.out.println("Escribe otro numero entero de 2 digitos ");
        numero2 = x.nextInt();
        int suma;
        int digito1num1;
        int digito2num1;
        int digito1num2;
        int digito2num2;
        suma=0;
        digito1num1= numero1/10;
        digito2num1= numero1%10;
        digito1num2= numero2/10;
        digito2num2= numero2%10;
        if(Math.abs(numero1)>9&&Math.abs(numero1)<=99){
            if(Math.abs(numero2)>9&&Math.abs(numero2)<=99){
                suma= digito1num1+ digito2num1+ digito1num2+ digito2num2;
                System.out.println("La suma de los digitos es: "+suma);
            }else{
                System.out.println("Ingrese un numero de 2 digitos");
            }
        }else{
            System.out.println("Ingrese un numero de 2 digitos");
        }
    }
}
