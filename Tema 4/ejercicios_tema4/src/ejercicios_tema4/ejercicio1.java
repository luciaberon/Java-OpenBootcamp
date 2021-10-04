package ejercicios_tema4;
import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int num1 = scanner.nextInt();
		System.out.println("Ingrese otro número");
		int num2 = scanner.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + sumarNumeros(num1,num2));
		System.out.println(num1 + " - " + num2 + " = " + restarNumeros(num1,num2));
		System.out.println(num1 + " * " + num2 + " = " + multiplicarNumeros(num1,num2));
		if (num2 == 0) {
			System.out.println("No se puede dividir por 0");
		} else {
			System.out.println(num1 + " / " + num2 + " = " + dividirNumeros(num1,num2));
		}
		scanner.close();
	}
	
	public static int sumarNumeros(int numero1, int numero2){
		 int total = numero1 + numero2;
		 return total;
	}

	public static int restarNumeros(int numero1, int numero2){
		int total = numero1 - numero2;
		return total;
	}
	
	public static int multiplicarNumeros(int numero1, int numero2){
		 int total = numero1 * numero2;
		 return total;
	}

	public static float dividirNumeros(int numero1, int numero2){
		float total = Float.valueOf(numero1) / Float.valueOf(numero2);
		return total;
	}

}
