import java.util.Random;

/**
 * Write a description of class SumadeMatrices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumadeMatrices
{
    public static void main(String[]args){
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] mSuma = new int[3][3];

        generarMatriz(m1);
        generarMatriz(m2);
        sumarMatrices(m1,m2,mSuma);
        mostrarMatriz(m1);
        System.out.println("----------------");
        mostrarMatriz(m2);
        System.out.println("----------------");
        System.out.println("----------------");
        mostrarMatriz(mSuma);
        System.out.println("Suma elementos de matriz Suma es: "+ sumarElementos(mSuma));

    }
    public static void generarMatriz(int[][]matriz){
        Random rand= new Random();
        for (int ren=0; ren<matriz.length;ren++){
            for(int col=0; col<matriz.length;col++){
                matriz[ren][col] = rand.nextInt(10)+1;
            }
        }
    }

    public static void mostrarMatriz(int[][]matriz){
        for(int ren=0; ren<matriz.length;ren++){
            for(int col=0;col<matriz[ren].length;col++){
                System.out.print(matriz[ren][col]+ ", ");
            }
            System.out.println();
        }
    }

    public static void sumarMatrices(int[][] matriz1, int  [][] matriz2,int[][]matrizSuma){
        for (int ren=0; ren<matrizSuma.length;ren++){
            for(int col=0; col<matrizSuma[ren].length;col++){
                matrizSuma[ren][col]=matriz1[ren][col]+ matriz2[ren][col];
            }
        }
    }

    public static int sumarElementos(int[][] matriz){
        int suma=0;
        for(int ren=0; ren<matriz.length; ren++){
            for(int col=0; col<matriz[ren].length;col++){
                suma= suma+ matriz[ren][col];
            }
        }
        return suma;
    }
}
