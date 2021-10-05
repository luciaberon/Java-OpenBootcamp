import java.util.Locale;
import java.util.Scanner;

public class ejercicio5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		  int numero;
		  int respuesta;
		  boolean correcto = false;
		  System.out.println("Generando número");
		  // Genera un número aleatorio
		  numero = (int) (Math.random() * 100);
		  System.out.println(numero);
		  System.out.println("¿Serás capaz de averiguarlo?");
		  // LÓGICA DEL JUEGO
		  
		  do {
		  System.out.println("Ingresa un número");
		  respuesta = entrada.nextInt();
		  if (respuesta == numero) {
			  System.out.println("Correcto!! Acertaste");
		  }
		  } while (numero != respuesta);  
		  

	}

}
