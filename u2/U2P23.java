import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se requiere determinar la hipotenusa de un triángulo rectángulo.
// Recuerde que por Pitágoras se tiene que: C2 = A2 + B2
 
public class U2P23
{
    public static void main(String[]args) throws java.io.IOException {
        double catetoA,catetoB,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa el cateto A");
        catetoA = Double.parseDouble(br.readLine());
        System.out.println("Ingresa el cateto B");
        catetoB = Double.parseDouble(br.readLine());
        c=Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB,2));
        
        System.out.printf("La hipotenusa del triangulo es de: %5.2f",c);
        System.out.printf("\nLa hipotenusa del triangulo con cateto A= %5f y con cateto B= %5f y la hipotenusa C= %5.2f",catetoA,catetoB,c);
        
    }
}
