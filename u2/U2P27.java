import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se tiene el nombre y la edad de tres personas. Se desea  
//saber el nombre y la edad de la persona de menor edad. 

public class U2P27{
    public static void main (String[]args)
     {
        int edad1;
        Scanner x = new Scanner(System.in);
        System.out.println("Edad primera persona ");
        edad1 = x.nextInt();
        int edad2;
        System.out.println("Edad segunda persona ");
        edad2 = x.nextInt();
        int edad3;
        System.out.println("Edad tercera persona ");
        edad3 = x.nextInt();
        
        System.out.println("Nombre primera persona ");
        String nombre1 = x.next();
        System.out.println("Nombre segunda persona ");
        String nombre2 =  x.next();
        System.out.println("Nombre tercera persona ");
        String nombre3 =  x.next();

        
        if(edad1<=edad2 && edad1<=edad3){
            System.out.printf("El menor es con: %s con %d años",nombre1,edad1);
        }else{
            if(edad2<edad3){
                System.out.printf("El menor es %s con: %d años",nombre2,edad2);
            }else{
                System.out.printf("El menor es %s con: %d años",nombre3,edad3);
            }
        }
     }
    }