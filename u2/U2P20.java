import java.io.BufferedReader;
import java.io.InputStreamReader;


//Una empresa importadora desea determinar cuántos dólares 
//puede adquirir con equis cantidad de dinero mexicano.  

public class U2P20{
    public static void main (String[]args) throws java.io.IOException {
        double pesos,tdc,dolares;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nIngresa los pesos que quieras cambiar: ");
        pesos=Double.parseDouble(br.readLine());
        System.out.println("Ingresa el tipo de cambio: ");
        tdc=Double.parseDouble(br.readLine());
        dolares= pesos/tdc;
        
        System.out.printf("Los dolares adquiridos son: %5.2f",dolares);
        
    }
}