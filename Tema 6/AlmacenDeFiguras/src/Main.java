import java.util.Locale;
import java.util.Scanner;
public class Main {
// Clase encargada de la entrada y salida del teclado
  static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
  public static void main(String[] args) {
    int operacion;
    boolean salir = false;
    // CREAR OBJETOS
    Rectangulo rect = new Rectangulo();
    Circulo circ = new Circulo();
    Triangulo triang = new Triangulo();
    // RELLENAR
    while (!salir) {
        System.out.print("Elige el tipo de figura que quieres consultar:");
        System.out.println("1 - Rectángulo / 2 - Círculo / 3 - Triángulo /"+ 
        " 4 - Comparar");
        operacion = entrada.nextInt();
        switch (operacion) {
          case 1:
            // RELLENAR
        	System.out.println("Rectángulo: " + rect.getColor());
        	System.out.println("base: " + rect.getBase());
        	System.out.println("altura: " + rect.getAltura());
        	System.out.println("area: " + rect.getArea());
            break;
          case 2:
            // RELLENAR
          	System.out.println("Círculo: " + circ.getColor());
          	System.out.println("radio: " + circ.getRadio());
          	System.out.println("area: " + rect.getArea());
          	break;
          case 3:
            // RELLENAR
          	System.out.println("Triángulo: " + triang.getColor());
          	System.out.println("base: " + triang.getBase());
          	System.out.println("altura: " + triang.getAltura());
          	System.out.println("area: " + triang.getArea());
            break;
          case 4:
            // RELLENAR
        	if (compararRectanguloTriangulo(rect,triang)) {
        		System.out.println("El rectángulo tiene un área mayor.");
        	} else {
        		System.out.println("El triángulo tiene un área mayor.");
        	}
        	  
            break;
        }
     }
    }
  	  public static boolean compararRectanguloTriangulo(Rectangulo rect, Triangulo tria) {
	    return rect.getArea() > tria.getArea();
	  }
	  
	  public static boolean compararRectanguloConLimite(Rectangulo rect, int lim) {
	    return rect.getArea() > lim;
	  }
}
  
  
  
  
  
  
  
  
  