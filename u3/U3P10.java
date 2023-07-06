package Unidad3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 * Leer un número entero y determinar a cuánto es igual
 * la suma de todos los enteros comprendidos entre 1 y el número leído.
 * @author (Guillermo Ortiz) 
 * @version (07/10/22)
 */
public class U3P10
{
    public static void main(String[]Args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num,suma,seguir=-1;
        do{
            System.out.println("Ingresa un entero positivo: ");
            num= Integer.parseInt(br.readLine());
            suma=0;
            if(num>=3){
                suma=(num*(num+1))/2-1-num;
            }
            System.out.println("La suma entre 1 y " + num + " es: " + suma);
            seguir=JOptionPane.showConfirmDialog(null, "Otra vez?");
        }while(seguir==0);
    }
}

