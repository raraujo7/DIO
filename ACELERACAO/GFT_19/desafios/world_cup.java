import java.io.IOException;
import java.util.Scanner;

public class DIO {

	public static void main(String [] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		while (entrada.hasNext()) {
			int num = entrada.nextInt();
			if (num >= 0 && num <= 100) {
				if (num == 0) {
					System.out.println("vai ter copa!");
				} else {
					System.out.println("vai ter duas!");
				}
			}
		}
	}
}