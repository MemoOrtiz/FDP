
/**
 * Write a description of class Arreglo_Unidimensional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arreglo_Unidimensional
{
    public static void main(String[]Args){
        int[] arreglo = new int [5];
        for(int indice=0; indice<arreglo.length; indice++){
            arreglo[indice] = indice+1;
        }
        for(int indice=0; indice<arreglo.length; indice++){
            System.out.println(arreglo[indice]);
        }
    }
}
