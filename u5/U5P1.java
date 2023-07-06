import java.util.Scanner;

/**
 * Write a description of class U5P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U5P1
{
    public static void main (String[]arg) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		num=sc.nextInt();
		int digito =obtenerUltimoDigito(num);
		System.out.println(digito);
	}
	public static int obtenerUltimoDigito(int num){
		int resultado=num%10;
		return resultado;
	}
}
