import java.util.Scanner;


// Leer un número entero de tres dígitos y 
// determinar en qué posición está el mayor dígito.  

public class U2P16
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
             if (digito1>digito2){
                 if (digito1==digito3){
                 System.out.println("Digitos iguales: "+digito1);
             }else{
                 if(digito1>digito3){
                     System.out.println("El primer digito es el mayor: "+digito1);
                 }
             }
            }else{
                if(digito2==digito3){
                    System.out.println( "Digitos iguales: "+digito2);
                }else{
                    if (digito2==digito3){
                        System.out.println("Digitos iguales: "+digito2);
                    }else{     
                     if(digito2>digito3){
                         System.out.println("El segundo digito es el tercero: "+digito2);
                     }else{
                         System.out.println("El tercer digito es el mayor: "+digito3);
                     }
                 }
                }
            }
        }else{
            System.out.println("Ingrese un numero de 3 digitos");
        }
    }
}
                
            
             