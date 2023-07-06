
import java.util.Arrays;
import java.util.Scanner;

public class U4P39v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arreglo[] = new int[8];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = sc.nextInt();
		}
		Arrays.sort(arreglo);
		int may = arreglo[0];
		int men = arreglo[7];
		double semisuma = (may + men) / 2.0;
		if (semisuma % 2 == 0)
			System.out.println("Es par");
		else
			System.out.println("Es impar");

	}
}