import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class U4P64 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U4P64
{
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int c=0;
        int m[][] = new int [5][5];
        for(int ren=0;ren<m.length;ren++){
            for(int col=0;col<m[ren].length;col++){
                m[ren][col] = rand.nextInt(150)+1;
                System.out.print(m[ren][col] + ", ");
            }
            System.out.println();
        }
        for(int ren=0;ren<m.length;ren++){
            for(int col=0;col<m[ren].length;col++){
                if ( m[ren][col]>99){
                    c=c+1;
                }
            }
            
        }
        System.out.println("La cantidad de numeros de 3 digitos es de: "+c);
    }
}
