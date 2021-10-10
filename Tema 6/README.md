# Tema 6

<h3>Clases en Java y Objetos </h3>

<h3>Clase</h3>

Una clase es la descripción de un conjunto de objetos similares; consta de métodos y de datos que resumen las características comunes de dicho conjunto.

<h4>Objeto</h4>

Un objeto es una entidad específica que pertenece a una clase.

Un objeto ocupa un espacio en la memoria, al igual que las variables primitivas. 

Sin embargo, hay una diferencia a la hora de crearlas.

En este caso de variables primitivas, se guarda el valor 2 en un espacio de memoria.

```java
int i; // Reserva un espacio de memoria.
i = 2; // Guarda dentro de "i" el valor 2.
```
En este caso de objetos, "r" es una referencia a la zona de memoria donde se creó el objeto Rectángulo.

```java
Rectangulo r; // No reserva nada.
Rectangulo r = new Rectangulo(); // Reserva un espacio en memoria donde crea el objeto Rectangulo 
                                 // y guarda en la variable "r" una referencia a esa zona de la memoria.
```

```java
// Sólo tenemos dos variables apuntando al mismo objeto
Rectangulo rect1 = new Rectangulo();
Rectangulo rect2 = rect1;
```

Si un espacio de memoria pierde todas sus referencias, entonces el objeto en dicho espacio va a ser liberado por el Garbage Collector.


<h3>Partes de una clase</h3>

```java
package Figuras;
public class Rectangulo {
  // CAMPOS
  private float base;
  private float altura;
  private float area;
  String color;
  // CONSTRUCTORES
  public Rectangulo() {
    this.base = 1;
    this.altura = 2;
    this.area = calcularArea();
    color = "rojo";
  }
  
  public Rectangulo(float base, float altura) {
    this.base = base;
    this.altura = altura;
    this.area = calcularArea();
    color = "rojo";
  }
  
  // OTROS MÉTODOS DE LA CLASE
  private float calcularArea() {
    return base*altura/2;
  }
  // GETTERS Y SETTERS
  public float getBase() {
    return base;
  }
  
  public void setBase(float base) {
    this.base = base;
  }
  
  public float getAltura() {
    return altura;
  }
  
  public void setAltura(float altura) {
    this.altura = altura;
  }
  
  public float getArea() {
    return area;
  }
}
```

<h4>Sobrecarga de métodos</h4>

Consiste en varias funciones con un mismo nombre, retornando valores de diferentes tipos.

<h4>Constructores</h4>

Son los métodos llamados al inicializar un objeto. Tienen el mismo nombre que el objeto.

Los constructores pueden sobrecargarse.

<h4>Paquetes</h4>

Los paquetes son un conjunto de clases. Se emplea el uso de paquetes cuando tenemos muchas clases y necesitamos dividirlas en secciones.

Ej: la clase Rectángulo estaría dentro del paquete Figuras, junto a las clases Cuadrado, Triángulo, Círculo, etc.

<h4>Modificadores de acceso</h4>

<ul>
    <li>Public: visible desde cualquier parte de la aplicación.</li>
    <li>Private: visible solo dentro de la clase. </li>
    <li>Protected: visible dentro del paquete y subclases </li>
    <li>Por defecto: visible dentro del paquete.</li>
</ul>


<h4>Getter & Setter</h4>

Son métodos que permiten modificar o mostrar el valor de una variable con el modificador private desde fuera de la clase. 
Aunque la variable es privada el método es público.

```java
// GETTERS Y SETTERS
public float getBase() {
  return base;
}

public void setBase(float base) {
  this.base = base;
}
```

No podemos tener variables con el mismo nombre, pero hay casos en que el nombre de un atributo de clase
puede coincidir con el de una variable o un parámetro. <br>

Si queremos que se utilice el atributo de clase escribiremos this.nombrevariable. De esta forma informamos al 
compilador de que debe utilizar el atributo del objeto.


<h4>Imports</h4>

Cuando queremos acceder a otros paquetes podemos incluir imports a nuestro código que indican la ruta de donde se encuentran los paquetes.

<h4>Modificador static </h4>

Un dato estático es una variable miembro que no se asocia a un objeto (instancia) de una clase, sino que se asocia a la clase misma.






