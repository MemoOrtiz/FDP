import java.util.Scanner;


//. Leer dos números enteros de dos dígitos y determinar si tienen dígitos comunes 

public class U2P12
{
    public static void main (String[]args)
    {
        int numero1;
        Scanner x = new Scanner(System.in);
        System.out.println("Escribe un numero entero ");
        numero1 = x.nextInt();
        int numero2;
        int digito1num1;
        int digito2num1;
        int digito1num2;
        int digito2num2;
        System.out.println("Escribe otro numero entero ");
        numero2 = x.nextInt();
        digito1num1= numero1/10;
        digito2num1= numero1%10;
        digito1num2= numero2/10;
        digito2num2= numero2%10;
        if(digito1num1==digito1num2){
            System.out.println("Tienen digitos en común");
        }else{
            if(digito1num1==digito2num2){
                System.out.println("Tienen digitos en común");
            }else{
                if(digito2num1==digito1num2){
                    System.out.println("Tienen digitos en común");
                }else if(digito2num1==digito2num2){
                    System.out.println("Tienen digitos en común");
                }else{
                    System.out.println("No tienen digitos en común");
                }
            }
        }
    }
}
