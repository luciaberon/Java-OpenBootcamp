import java.util.Locale;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Clase encargada de la entrada y salida del teclado
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("EJERCICIO 1");
		System.out.println("¿Está lloviendo?: ");
		System.out.println("1 - Si / 2 - No");
		// Permite capturar lo que se escribe por teclado
		int llueve = entrada.nextInt();
		System.out.println("¿Tienes un paraguas?: ");
		System.out.println("1 - Si / 2 - No");
		// Permite capturar lo que se escribe por teclado
		int paraguas = entrada.nextInt();
		
		if (llueve == 1 && paraguas == 2) {
			System.out.println("Tienes que comprar un paraguas.");
		} else if (llueve == 2) {
			System.out.println("Ve a la playa.");
		} else if (llueve == 1 && paraguas == 1) {
			System.out.println("Coge el paraguas.");
		}

	}

}
