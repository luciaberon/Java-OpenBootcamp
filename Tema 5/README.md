# Tema 5

<h3>Estructuras de control</h3>

Las estructuras de control son aquellas que pueden cambiar el flujo de ejecución del programa.

<h4>Tipos de estructuras de control</h4>

<h5>If - else</h5>

Es un si condicional, en el que si se cumple la condición se ejecuta el código dentro de la estructura.

En caso de que no se cumpla, se ejecutará el código dentro del bloque else (este es opcional).

```
if (condición) {
  //Si se cumple la condicón se ejecutará este bloque de código
} else {
  //Y si no se cumple la condición se ejecutará este bloque
}
```

<h5>Bucle</h5>

Un bucle es una secuencia que se repite hasta que la condición determinada deje de cumplirse.

<li>While: la secuencia se repite infinitamente hasta que la condición sea falsa</li>
<li>For: la secuencia se repite un número determinado de veces</li>
```
for (inicialización ; condición ; incremento) {
 Sentencias a ejecutar en bucle
}
```
<li>Foreach: es una forma más limpia para recorrer estructuras</li>

```
for (tipo nombreVariable : nombreArray) {
  // bloque que se ejecutará
}
```

<li>Do while: es similar al bucle while, pero la secuencia se ejecuta al menos una vez antes de evaluar la condición</li>

```
do {
  Sentencias a ejecutar en bucle
  Revisar variable condición o incrementarla
} while (condición)
```


<li>Switch: recibe un valor y establece varias condiciones. Se ejecutará el caso de la condición cumplida. Si no se cumple ninguna se puede agregar de forma opcional un caso "default"</li>

```
switch (operacion) {
  case 0:
    // Sumar
    break;
  case 1:
    // Restar
    break;
  case 2:
    // Multiplicar
    break;
  case 3:
    // Dividir
  default:
    // Mensaje al usuario
}
```









