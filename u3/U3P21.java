package Unidad3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class U3P21
{
    public static void main(String[]Args){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingresa un entero");
        int numero = escaner.nextInt();
        int cont=0;
        int suma=0;
        int contador=0;
        int digitos;
        int num=0;
        int residuo=0;
        int seguir=-1;
        num=num+numero;
        do{
            while(num>=1){
                num=num/10;
                cont=cont+1;
            }
            digitos=cont;
            System.out.println("digitos: "+digitos);
            for(contador=0;contador<digitos;contador++){
                residuo=numero%10;
                suma=suma+residuo;
                numero=numero/10;
            }
            System.out.println("La suma es: " +suma);
            seguir=JOptionPane.showConfirmDialog(null, "Otra caso?");
        }while(seguir==0);
    }

}
