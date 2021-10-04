package ejercicios_tema4;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca el radio de la esfera:");
		double radio = scanner.nextDouble();
		System.out.println("El volumen de la esfera con radio es " + calcularVolumenEsfera(radio));
		scanner.close();
	}
	
	public static double calcularVolumenEsfera(double radio) {
		double resultado = (4.0/3)* Math.PI * Math.pow(radio, 3);
		return resultado;
	}

	
}
