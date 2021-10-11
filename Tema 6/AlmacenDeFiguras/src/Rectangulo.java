public class Rectangulo {
    // CAMPOS
    private float base, altura, area;
    public float getBase() {
		return base;
	}

	public float getAltura() {
		return altura;
	}

	public String getColor() {
		return color;
	}
	String color;
    // CONSTRUCTORES
    public Rectangulo() {
      this.base = 1;
      this.altura = 2;
      this.area = calcularArea();
      color = "rojo";
    }
    
    public float getArea() {
    	return calcularArea();
    }
    
    
    
    public Rectangulo(int base, int altura) {
      // COMPLETAR
      this.base = base;
      this.altura = altura;
    }
    // OTROS METODOS DE LA CLASE
    private float calcularArea() {
      float resultado = base*altura;
      return resultado;
    }
}