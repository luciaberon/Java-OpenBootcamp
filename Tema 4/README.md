# Tema 4  

<h3>Funciones</h3>

Una función es un conjunto de líneas de código (instrucciones), encapsulados en un bloque

Para declarar una función se utiliza la siguiente sintaxis:

```
[acceso] [modificador] tipo nombreFuncion([tipo nombreArgumento,[tipo nombreArgumento]...]){
  /*
    * Bloque de instrucciones
  */

  return valor;
}
```
<br>
<ul>
<li>Modificador de acceso: puede ser public or private. Indica el ámbito de la función. 
    <ul>
    <li>Si es public, todas las clases tienen acceso a ella.</li>
    <li>Si es protected, sólo se tiene acceso a ella desde la propia clase que lo define y las que heredan de él</li>
    <li>Si es private, sólo la misma clase tiene acceso a ella</li>
    <li>Si es package, las clases que se encuentran en el mismo paquete tendrán acceso a ella</li>
    </ul>
</li>
<li>Modificador: si es static, entonces pertenece a la clase. Si es final no admitirá cambios después de su declaración y asignación de valor.</li>
<li>Tipo: indica el valor de retorno (int, double, string, etc)</li>
<li>Nombre de la función: será el nombre que le asignemos para invocarla</li>
<li>Parámetros: valores que recibe la función por parte del código que la llama. Pueden ser tipos simples u objetos</li>
</ul><br>


Para usar una función tenemos que en el main de nuestro proyecto llamar a la función

```
funcionEntero();
```

<h5>Funciones anónimas</h5>

Las expresiones lambda son funciones anónimas (no necesitan una clase).

```
(parametros) -> {cuerpo lambda}
```

Ejemplo:

```java
(String x) -> {
  String retorno = x;
  retorno = retorno.concat(» ***»);
  return retorno;
}
```

<h3>Sobrecarga de funciones</h3>

La sobrecarga (overloading) de las funciones puede resultar muy útil al efectuar llamadas a un método, ya que en lugar de tener que recordar identificadores de métodos distintos, basta con recordar uno sólo.

<hr>































