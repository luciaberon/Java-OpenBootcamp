import java.util.Scanner;


public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int salir;
		do {
			System.out.println("¿Quieres salir del bucle?");
			salir = scanner.nextInt();
		} while (salir != 1);
		
	}

}
