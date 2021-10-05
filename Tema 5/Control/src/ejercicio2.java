import java.util.Locale;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("EJERCICIO 2");
		System.out.println("Selecciona un mes: ");
		System.out.println("1 - Enero / 2 - Febrero / 3 - Marzo / 4 - Abril / "
		 + "Mayo / 6 - Junio / 7 - Julio / 8 - Agosto / 9 - Septiembre /"
		 + " 10 - Octubre / 11 - Noviembre / 12 - Diciembre");
		// Permite capturar lo que se escribe por teclado
		int mes = entrada.nextInt();
		
//		switch (mes) {
//		
//		case 1:
//			System.out.println("31 días");
//			break;
//	    case 2:
//			System.out.println("28 días");
//			break;
//		case 3:
//			System.out.println("31 días");
//			break;
//	    case 4:	    	
//			System.out.println("30 días");
//			break;
//		case 5:			
//			System.out.println("31 días");
//		    break;
//		case 6:
//			System.out.println("30 días");
//			break;
//		case 7:
//			  System.out.println("31 días");
//			  break;
//		case 8:
//			  System.out.println("31 días");
//			  break;
//		case 9:
//			  System.out.println("30 días");
//			  break;
//		case 10:
//			  System.out.println("31 días");
//			  break;
//		case 11:
//			  System.out.println("30 días");
//			  break;
//		case 12:
//			  System.out.println("31 días");
//			  break;
//		}
		
		switch (mes) {
		  case 2:
		    System.out.println("28 días");
		    break;
		  case 4:
		  case 6:
		  case 9:
		  case 11:
		    System.out.println("30 días");
		    break;
		  default:
		    System.out.println("31 días");
		}
	}

}
