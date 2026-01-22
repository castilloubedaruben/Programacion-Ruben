# Java - Resumen Rápido

## 1. Tipos de Datos
### Tipos Primitivos

### Números

**Enteros**

```java
byte edadMinima = 18;
short temperatura = 24000;
int poblacion = 1000000;
long distanciaEstrellas = 9223372036854775807L;
```

**Números decimales:**

```java
float peso = 72.5F;
double altura = 1.75;
```

**Carácter:**

```java
char inicial = 'A';
```

**Booleano:**
```java
boolean esMayor = true;
```

### Tipos de Referencia

**Cadenas (string)**

```java
String nombre = "Juan";
String saludo = "Hola, " + nombre;
System.out.println(saludo); // "Hola, Juan"

```

### Caracteristas de String

```java
nombre.length();           // longitud
nombre.charAt(0);          // obtener primer carácter
nombre.substring(1,3);     // subcadena
nombre.replace('J','L');   // reemplazo
nombre.toUpperCase();      // mayúsculas
nombre.toLowerCase();      // minúsculas
nombre.trim();             // eliminar espacios
nombre.equals("hola");     // comparación exacta
nombre.equalsIgnoreCase("hola"); // comparación ignorando mayúsculas/minúsculas
```

## 2. Variables

```java
int x = 10;      // entero
double y = 3.14; // decimal
final int z = 30; // constante
```

## 3. Entrada y Salida

### Entrada: 

```java
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese su nombre: ");
String nombre = scanner.nextLine();

System.out.print("Ingrese su edad: ");
int edad = scanner.nextInt();
scanner.nextLine(); // limpiar buffer

System.out.println("Hola, " + nombre + ", tienes " + edad + " años.");
scanner.close();
```

### Salida: 

```java
System.out.println("Hola Mundo");
System.out.print("Hola ");
System.out.println("Mundo!");
```

## 4. Operadores
```java
10 + 5; // 15
10 - 5; // 5
10 * 5; // 50
10 / 2; // 5
10 % 3; // 1
```

### Lógicos

```java
edad >= 18 && edad <= 65; // AND
edad < 18 || edad > 65;   // OR
!(edad >= 18);             // NOT
```
### Comparación
```java
==, ===, !=, !==, <, >, <=, >=
```

## 6. Condicionales
   
```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
} else if (edad < 13) {
    System.out.println("Niño");
} else {
    System.out.println("Adolescente");
}

```
## 7. Bucles

### for
```java
for (int i = 0; i < 5; i++) System.out.println(i);
```

### while
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### for..each
```java
String[] frutas = {"manzana","banana"};
for (String fruta : frutas) System.out.println(fruta);
```


## 8. ArrayList

**Creación de un ArrayList**
```java
ArrayList<String> nombres = new ArrayList<String>();
```
ArrayList<String>: Declara un ArrayList que almacena elementos de tipo String.
new ArrayList<String>(): Crea una nueva instancia del ArrayList.

**Acceso elementos: get()**
```java
String primerNombre = nombres.get(0);  // Obtiene el primer elemento
System.out.println(primerNombre);
```

**Añadir elementos: add()**
```java
nombres.add("Juan");
nombres.add("Ana");
nombres.add("Pedro");


Añadir Posicion Especifica:

nombres.add(1, "Carlos");  // Inserta "Carlos" en la posición 1
```

**Modificar Elementos: set()**
```java
set() permite reemplazar un elemento en una posición dada.

nombres.set(1, "Lucía");  // Reemplaza "X" por "Lucía"
```

**Eliminar elementos remove()**

```java
"Eliminar por índice:"

nombres.remove(0);  // Elimina el primer elemento

"Eliminar por valor:"

nombres.remove("Ana");  // Elimina "Ana" de la lista
```

**Obtener el Tamaño de la Lista: size()**
```java
System.out.println("Tamaño: " + nombres.size());  
```

**Verificar si Está Vacío: isEmpty()**

```java
if (nombres.isEmpty()) {
    System.out.println("La lista está vacía.");
} else {
    System.out.println("Hay elementos en la lista.");
}
```
**Limpiar el ArrayList: clear()**
```java
nombres.clear();
System.out.println("Tamaño después de limpiar: " + nombres.size()); 
```

**Buscar Elementos: contains()**

```java
if (nombres.contains("Lucía")) {
    System.out.println("Lucía está en la lista.");
} else {
    System.out.println("Lucía no está en la lista.");
}
```

## 9. Recorrer Arrays

**Usando un bucle for tradicional (con índice):**
```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();
nombres.add("Juan"); // agregar
nombres.add(1, "Carlos"); // insertar
String primer = nombres.get(0); // obtener
nombres.set(1,"Lucía"); // modificar
nombres.remove("Ana"); // eliminar por valor
System.out.println(nombres.size()); // tamaño

for (String nombre : nombres) System.out.println(nombre);

for (int i = 0; i < nombres.size(); i++) {
  System.out.println(nombres.get(i));
}
```

**Usando un bucle for-each:**
```java
for (String nombre : nombres) {
    System.out.println(nombre);
}
```


## 10. Funciones

### Declaración de función
```java
public static int sumar(int a, int b) {
    return a + b;
}

public static void imprimirMensaje() {
    System.out.println("Hola!");
}

public static double calcularArea(double base, double altura) {
    return (base * altura)/2;
}
```

**Llamada a funciones**

```java
int resultado = sumar(5,10);
System.out.println("La suma es: " + resultado);
```

### Generación de Números Aleatorios en Java

| Propósito                                      | Fórmula                                        | Ejemplo                                   |
| ---------------------------------------------- | ---------------------------------------------- | ----------------------------------------- |
| Número entre 0 y un valor máximo (max)         | `(int)(Math.random() * (max + 1))`             | `(int)(Math.random() * 11)`               |
| Número entre 1 y un valor máximo (max)         | `(int)(Math.random() * max) + 1`               | `(int)(Math.random() * 10) + 1`           |
| Número entre un mínimo (min) y un máximo (max) | `(int)(Math.random() * (max - min + 1)) + min` | `(int)(Math.random() * (15 - 5 + 1)) + 5` |
| Decimal entre 0 y 1                            | `Math.random()`                                | `Math.random()`                           |
