# Tema 3

<h3>Variables</h3>

Las variables son espacios de memoria en el que guardamos un determinado valor.

Sintaxis para definir variable:

```

Tipo nombreVariable [= valorInicial];

```

"valorInicial" se encuentra entre corchetes debido a que es opcional. 

Cuando no se le asigna un valor inicial a una variable, significa que fue <b>declarada</b>.

Si se le asigna un valor inicial, entonces es <b>inicializada</b>.

```
tipo nombreVariable; //Declaramos la variable
nombreVariable = valorInicial //La inicializamos despues de declararla

```

La forma en la que nombramos variables sigue estándares que varían según el lenguaje de programación usado.

En el caso de Java, la forma de nombrar variables es por camelCase. La primer palabra siempre en minúscula, y el resto (si es que tiene más de una) capitalizadas.


```java

String nombreDeVariable = "He declarado una variable."


```

Tipos de variables:

<li>short</li>
<li>integer</li>
<li>long</li>
<li>float</li>
<li>double</li>
<li>boolean</li>
<li>char</li>
<li>string</li>


<h4>Palabras reservadas</h4>

Las palabras reservadas no pueden ser utilizadas como identificadores por los programadores para definir variables, constantes, etc.

<a href="https://www.javatpoint.com/java-keywords">Aquí se puede ver todas las palabras reservadas de Java</a>

<hr>

<h2> Ejercicios </h2>

1) ¿Cuáles son los tipos primitivos que hay en Java? <br>

short, integer, long, float, double, boolean, char, string

2) Explica porque no se pueden utilizar las keywords (palabras reservadas) para nombrar una variable, método, etc... <br>

No pueden utilizarse porque ya tienen un propósito determinado. Por ejemplo, "double" es una palabra reservada porque su propósito es declarar
variables de tipo double. 

3) ¿Se puede declarar una variable sin asignarle un valor? Razona tu respuesta. <br>

Si se puede, cuando a una variable no se le asignó un valor inicial, entonces fue inicializada.

4) Explica con tus palabras que son las variables y los identificadores <br>

Las variables son espacios de memoria a la que le damos un nombre y le asignamos un valor determinado. Los identificadores son el nombre de la variable.

5) ¿Cuáles son las reglas que se tienen que seguir respecto a los identificadores? <br>

<li>No pueden ser palabras reservadas</li>
<li>En el caso de Java, deben seguir el estándar camelCase al nombrarlas </li>
<li>En caso de que se esté definiendo una constante, debemos nombrar la variable con MAYÚSCULA </li>









 
