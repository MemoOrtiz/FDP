import java.io.BufferedReader;
import java.io.InputStreamReader;

//Se requiere determinar cuánto cobrar por trabajos de 
//pintura. Considere que se cobra por m2. 

public class U2P22{
    public static void main (String[]args) throws java.io.IOException {
        double metros,precio,total;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nEscribe los metros cuadrados a pintar: ");
        metros = Double.parseDouble(br.readLine());
        System.out.println("Escribe el precio del metro cuadrado: ");
        precio = Double.parseDouble(br.readLine());
        total = metros*precio;
        
        System.out.printf("El total a pagar es de: %7.2f",total);
    }
}