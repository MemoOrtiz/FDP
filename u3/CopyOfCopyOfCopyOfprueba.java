package Unidad3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CopyOfCopyOfCopyOfprueba
{
    public static void main(String[]Args){
        Scanner escaner = new Scanner(System.in);
        boolean seguir = false;
        int num = 4;

        if(num >= 10){

            String salida = "";

            int valor = 1;

            do{

                salida = salida + valor + ", ";

                valor = valor + 1;

            }while(valor <= num);

            JOptionPane.showMessageDialog(null, salida);

        }
    }
}

