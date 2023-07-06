import java.util.Scanner;

public class U4P39
{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arreglo = new int [8];
        int may,men,ss;
        for(int i=0; i<arreglo.length;i++){
            int a= sc.nextInt();
            arreglo[i]=a;
        }
        may = arreglo[0];
        men = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > may)
                may = arreglo[i];
            if (arreglo[i] < men)
                men = arreglo[i];
        }
        double semisuma = (may + men) / 2.0;
        if (semisuma % 2 == 0)
            System.out.print("Es par");
        else
            System.out.print("Es impar");

    }
}
