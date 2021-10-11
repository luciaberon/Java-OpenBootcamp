public class Triangulo {
  // CAMPOS
  private float base, altura, area;
  public String getColor() {
	return color;
}
String color;
  // CONSTRUCTORES
  public Triangulo() {
    this.base = 1;
    this.altura = 2;
    this.area = calcularArea();
    color = "rojo";
  }
  
  public float getArea() {
	  return calcularArea();
  }    
  
  public float getBase() {
	  return base;
  }
  
  public float getAltura() {
	  return altura;
  }
  
  public Triangulo(int base, int altura) {
    // RELLENAR
	  this.base = base;
	  this.altura = altura;
	  this.area = calcularArea();
	  color = "rojo";
  }
  // OTROS METODOS DE LA CLASE
  private float calcularArea() {
    float resultado = base*altura/2;
    return resultado;
  }
}