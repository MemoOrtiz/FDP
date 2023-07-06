import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Write a description of class U5P6 here.
 * codigo ascii
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U5P6
{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int seguir=-1;
        do{
            System.out.println("Escribe un entero: ");
            int num = sc.nextInt();
            System.out.println(aCaracter(num));
            seguir = JOptionPane.showConfirmDialog(null, "Probar otro");
            //dudas
            // int result = (int)Math.sqrt(23);
            //System.out.println((int)'M');
            
        }while(seguir==0);
    }
    public static char aCaracter(int num){
        return (char)num;
    }
}
