# Tema 2


<h3> Extensión de archivos java </h3>

<h4> Archivos .jar </h4>

Los .jar son archivos empaquetados (como los zip) que pueden ser ejecutados con software preinstalado.

<h4> Archivos .java y .class </h4>

Cuando escribimos un programa en JAVA se guarda el código fuente bajo una extensión ".java"

Posteriormente estos archivos son compilados al lenguaje de máquina de la máquina virtual JAVA (JVM). Los archivos compilados tienen extensión ".class"

<img href="http://4.bp.blogspot.com/_UxBljXKkbV4/S-cZ3j0489I/AAAAAAAAAZw/W0FM0NVBpUc/s400/java-class-programa.gif">

<hr>

<h3> Tipos de documentación </h3>

<b>Externa</b> <br>

Documentación que se encuentra fuera del código de la aplicación.

<b>Interna</b> <br>

Se encuentra en el código. Suele ser breve, y se encuentra contenida en comentarios.

<hr>

<h4> Documentación en java </h4>

<h5> Comentarios en una línea </h5>

```java

//voy a crear una variable hola

String hola;

```

<h5> Comentarios de varias líneas </h5>


```java

/* El comentario empezaria aquí

podriamos seguir comentando por aqui


y por aqui

y por último cerraríamos el comentario */

```


```java
/* El comentario empezaria y terminaría aquí */
```


<h5> Comentarios de la documentación </h5>

Estos comentarios se suelen emplear para generar una página de documentación para referencia.

```java


/**
    * Con este método cagemos tres enteros y sacamos su media.
    * @param a Primer parametro que se pasa
    * @param b Segundo parametro que se pasa
    * @param c Tercer parametro que se pasa
    * @return int devuelve el promedio
    *
	* @author  Imagina Formación
	* @version 1.0
	* @since   2020-09-01
    */
    public int findAvg(int a, int b, int c) 
    {
        return (a + b + c)/3;
    }

```


<a href="https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html">Información sobre los comentarios de documentación</a>



# Tema 2 - Ejercicios 

1) Investiga por tu cuenta dos aplicaciones, webs o videojuegos populares creados con java.

-Minecraft y NASA World Wind fueron hechos en Java

<br>

2) ¿Para que sirve el archivo manifest de la carpeta META-INF?

Este tiene la metadata del archivo .jar

<br>
3) Explica con tus propias palabras que conceptos intenta explicar la documentación  <br>

4) ¿Que son la documentación externa e interna? ¿Crees que son necesarias? ¿ Por que? <br>

La documentación intenta explicar cosas variadas dependiendo de su tipo (interna o externa). Si la documentación es interna,
entonces lo que el desarrollador va a explicar son fragmentos de código, variables, funciones, objetos, entre otros. También se puede 
emplear para generar documentación de referencia.

Si la documentación es externa, se suele ofrecer mediante esta:

-Manual de usuario
-Instrucciones de instalación
-Especificaciones del proyecto

<br>

5)
 Comenta este método usando comentarios de documentación.


```java

/**
    * Con este método sumamos dos enteros.
    * @param a Primer parametro que se pasa
    * @param b Segundo parametro que se pasa
    * @return c devuelve la suma
    *
	* @author  Lucia Beron
	* @version 1.0
	* @since   2021-10-01
    */

    public static int sumar(int a, int b){
           int c;
           c = a + b;
           return c;
    }

```


