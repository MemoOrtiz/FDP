import java.util.Random;
/**
 * Write a description of class U4P51 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U4P51
{
    public static void main (String[]arg){
        Random rand = new Random();
        int[][] m;
        m = new int [4][4];
        for(int ren=0;ren<m.length;ren++){
            for(int col=0; col<m[ren].length;col++){
                m[ren][col] = rand.nextInt(100)+1;
                System.out.print(m[ren][col] + ", ");
            }
            System.out.println();
        }
        int mayor,fila,columna;
        mayor= m[0][0];
        fila=0;
        columna=0;
        for(int ren=0;ren<m.length;ren++){
            for(int col=0;col<m[ren].length;col++){
                if ( m[ren][col] > mayor){
                    mayor = m[ren][col];
                    fila=ren;
                    columna= col;
                }
            }
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.print("Se encuentra en la posicion: ["+fila+ ", "+columna+ "]");
    }
}
