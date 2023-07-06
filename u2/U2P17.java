import java.util.Scanner;


//Leer un número entero de tres dígitos y
//determinar si algún dígito es múltiplo de los otros.

public class U2P17
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
                if(digito1%digito2==0){
                    System.out.println("Hay digitos son multiplos");
                }else{
                    if(digito1%digito3==0){
                        System.out.println("Hay digitos son multiplos");
                    }else{
                        if(digito2%digito1==0){
                            System.out.println("Hay digitos son multiplos");
                    }else{
                        if(digito2%digito3==0){
                            System.out.println("Hay digitos son multiplos");
                        }else{
                            if(digito3%digito1==0){
                                System.out.println("Hay digitos son multiplos");
                            }else{
                                if(digito3%digito2==0){
                                    System.out.println("Hay digitos son multiplos");
                                }else{
                                    System.out.println("Los digitos no son multiplos");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}