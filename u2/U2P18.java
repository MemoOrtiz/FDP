import java.util.Scanner;

//Leer tres números enteros y determinar cuál es el mayor
//Usar solamente dos variables.  

public class U2P18
{
    public static void main (String[]args)
    {
        int mayor;
        Scanner x = new Scanner(System.in);
        System.out.println("Escribe un numero entero ");
        mayor = x.nextInt();
        int num;
        System.out.println("Escribe otro numero entero ");
        num = x.nextInt();
        
        if(num>mayor){
            mayor=num;
        }
        System.out.println("Escribe otro numero entero ");
        num=x.nextInt();
        if (num>mayor){
            mayor=num;
        }
        System.out.println("El numero mayor es: "+mayor);
    }
}
        
        
        
        
