import java.util.Scanner;


//Leer dos números enteros y determinar cuál es el mayor 


public class U2P11
{
    public static void main (String[]args)
    {
        int numero1;
        Scanner x = new Scanner(System.in);
        System.out.println("Escribe un numero entero ");
        numero1 = x.nextInt();
        int numero2;
        System.out.println("Escribe otro numero entero ");
        numero2 = x.nextInt();
        
        if(numero1>numero2){
            System.out.println("El numero mayor es: "+ numero1);
        }else if(numero1==numero2){
            System.out.println("Los numeros son iguales: "+numero1);
        }else{
            System.out.println("El numero mayor es: "+numero2);
        }
        }
        }
        
