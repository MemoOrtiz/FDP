import java.util.Random;

/**
 * Write a description of class U4P71 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U4P71
{
    public static void main (String[]arg){
        Random rand = new Random();
        int [][] m1;
        int [][] m2;
        int [] vector;
        m1= new int [4][5];
        m2 = new int [4][5];
        vector= new int [11];
        for(int ren=0;ren<m1.length;ren++){
            for(int col=0;col<m1[ren].length;col++){
                m1[ren][col] = rand.nextInt(10)+1;
                //Para hacer rango en rand
                //m1[ren][col] = rand.nextInt(51)+50;
                System.out.print(m1[ren][col] + ", ");
            }
            System.out.println();
        }
        for(int ren=0;ren<m2.length;ren++){
            for(int col=0;col<m2[ren].length;col++){
                m2[ren][col] = rand.nextInt(10)+1;
                System.out.print(m2[ren][col] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        for(int ren=0;ren<m1.length;ren++){
            for(int col=0;col<m1[ren].length;col++){
                int valor=m1[ren][col];
                for(int ren2=0;ren2<m2.length;ren2++){
                    for(int col2=0;col2<m2[ren2].length;col2++){
                    if (m2[ren2][col2] ==valor){
                        if(vector[valor]==0){
                            vector[valor]=1;
                        }
                    }
                    }
                }
            }
        }
        int cont=0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]==1){
                cont=cont+1;
            }
        }
        System.out.println("Hay "+ cont+" elementos comunes");
    }
}
