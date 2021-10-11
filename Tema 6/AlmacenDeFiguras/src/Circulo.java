public class Circulo {
  // CAMPOS
  private float radio, area;
  public float getRadio() {
	return radio;
}

public String getColor() {
	return color;
}
String color;
  // CONSTRUCTORES
  public Circulo() {
    this.radio = 1;
    this.area = calcularArea();
    color = "rojo";
  }
  
  public float getArea() {
	  return calcularArea();
  }
  
  public Circulo(float radio) {
    //COMPLETAR
	this.radio = radio;
	this.area = calcularArea();
	color = "rojo";
  }
  // OTROS METODOS DE LA CLASE
  private float calcularArea() {
    float resultado = (float)(Math.PI * radio*radio);
    return resultado;
  }
}