
/**
 * Write a description of class Arreglo_Bidimensional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arreglo_Bidimensional
{
    public static void main(String[]args){
        int[][]tabla;
        tabla = new int [4][7];
        int valor=10;

        for(int renglon=0;renglon<tabla.length;renglon++){
            for(int columna=0;columna<tabla[renglon].length;columna++){
                tabla[renglon][columna] = valor;
                valor= valor+10;
            }
        }
        for(int renglon=0;renglon<tabla.length;renglon++){
            for(int columna=0;columna<tabla[renglon].length;columna++){
                System.out.print(tabla[renglon][columna] + ", ");
            }
            System.out.println();
        }
    }
}
