import java.util.Scanner;

//Leer dos números enteros de dos dígitos y 
//determinar si la suma de los dos números origina un número par 

public class U2P13
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
        suma=0;
        if(Math.abs(numero1)>9&&Math.abs(numero1)<=99){
            if(Math.abs(numero2)>9&&Math.abs(numero2)<=99){
            suma=numero1+numero2;
                if(suma%2==0){
                    System.out.println("La suma de los 2 numero es par ="+suma);
                }else{
                    System.out.println("La suma de los 2 numero no es par ="+suma);
                }
            }else{
                System.out.println("Ingresar un numero entero de 2 digitos");
            }
        }else{
            System.out.println("Ingresar un numero entero de 2 digitos");
        }
    }
}
                    