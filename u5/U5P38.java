import java.util.Random;
import javax.swing.JOptionPane;
/**
 * Write a description of class U5P38 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U5P38
{
    public static void main(String[]args){
        int seguir=-1;
        do{
        int [] arreglo = new int[6];
        generarArreglo(arreglo);
        mostrarArreglo(arreglo);
        sumarNumeros(arreglo);
        System.out.println("La cantidad de numeros terminados en 3: "+ sumarNumeros(arreglo));
        seguir = JOptionPane.showConfirmDialog(null, "Probar otro");
    }while(seguir==0);
    }
    public static void generarArreglo(int []Arreglo){
            Random rand= new Random();
            for(int i=0;i<Arreglo.length;i++){
                Arreglo[i]=rand.nextInt(100)+1;
            }
    }
    public static void mostrarArreglo(int[]Arreglo){
        for(int i=0;i<Arreglo.length;i++){
            System.out.println(Arreglo[i]+ ", ");
        }
    }
    public static int sumarNumeros(int[]Arreglo){
        int suma=0;
        for(int i=0;i<Arreglo.length;i++){
            if (Arreglo[i]% 10 ==3){
                suma=suma+1;
            }
        }
        return suma;
    }
}
