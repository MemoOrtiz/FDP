import java.util.Scanner;

//Leer tres numeros entero y mostrarlos ascedentemente

public class U2P19
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
        int numero3;
        System.out.println("Escribe otro numero entero ");
        numero3 = x.nextInt();
        int mayor;
        int intermedio;
        int menor;
        
        if(numero1>numero2 && numero1>numero3){
            mayor=numero1;
        }else if(numero2>numero1 && numero2>numero3){
                mayor=numero2;
            }else{
            mayor=numero3;
        }
        if(numero1<numero2 && numero1<numero3){
            menor=numero1;
        }else if(numero2<numero1 && numero2<numero3){
            menor=numero2;
        }else{
            menor=numero3;
        }
        intermedio=(numero1+numero2+numero3)-(mayor+menor);
        System.out.println("El orden ascendente de los numeros es: ");
        System.out.println(menor);
        System.out.println(intermedio);
        System.out.println(mayor);
        }
    }

