# JavaScript - Resumen Rápido

## 1. Tipos de Datos

### Números (`number`)
Enteros o decimales, no hay distinción explícita.
```js
let a = 10;
let b = 3.14;
console.log(a + b); // 13.14
```

### Cadenas (string)

Texto, se crean con '...', "..." o `...`.
```js
let saludo = "Hola, Mundo!";
let nombre = 'Juan';
let bienvenida = `Hola, ${nombre}!`;
```

### Caracteristas de String

**Mayúsculas / Minúsculas**
```js
s1.toUpperCase();
s2.toLowerCase();
```

**Extraer / reemplazar**

```js
s1.slice(0,2);           // "Ho"
s1.replace("Ho","He");   // "He la"
```

**Dividir**
```js
"manzana,pera".split(","); // ["manzana","pera"]
```

**Buscar**
```js
s1.indexOf("a");
s1.includes("a");
s1.startsWith("H");
s1.endsWith("a");
```

**Limpiar espacios**
```js
"  hola  ".trim(); // "hola"
```

**Longitud**
```js
s1.length;
```

### Booleanos (boolean)

**Verdadero (true) o falso (false).**
```js
let esAdulto = (20 >= 18); // true
```

**Nulo e Indefinido (null, undefined)**
```js
let valorNulo = null;
let valorNoDefinido; // undefined
```
## 2. Variables
```js
var x = 10;      // Tradicional
let y = 20;      // Ámbito de bloque
const z = 30;    // Constante
```

## 3. Entrada y Salida

### Entrada: prompt()
```js
let nombre = prompt("Introduce tu nombre:");
console.log("Hola, " + nombre + "!");
```
### Salida: console.log()

```js
console.log("Edad:", 25);
```

## 4. Conversión de Tipos

```js
let edad = Number(prompt("Edad:")); // Convertir a número
let texto = String(123);            // Convertir a string
```
## 5. Operadores
```js
10 + 5; // 15
10 - 5; // 5
10 * 5; // 50
10 / 2; // 5
10 % 3; // 1
```

### Lógicos

```js
edad >= 18 && edad <= 65; // AND
edad < 18 || edad > 65;   // OR
!(edad >= 18);             // NOT
```

### Comparación
```js
==, ===, !=, !==, <, >, <=, >=
```

## 6. Condicionales
   
```js
if (edad >= 18) {
  console.log("Mayor de edad");
} else if (edad < 13) {
  console.log("Niño");
} else {
  console.log("Adolescente");
}
```
## 7. Bucles

### for
```js
for (let i = 0; i < 5; i++) console.log(i);
```

### while
```js
let i = 0;
while (i < 5) {
  console.log(i);
  i++;
}
```
### for..of
```js
let frutas = ['manzana','banana'];
for (let fruta of frutas) console.log(fruta);

```
## 8. Arrays

**Acceso y modificación**

```js
let numeros = [10, 20, 30];
console.log(numeros[0]); // 10
numeros[1] = 25;         // Modifica índice 1
```

**Último elemento**
```js
console.log(numeros[numeros.length - 1]); // 30
console.log(numeros.at(-1));             // 30
```

**Añadir elementos**
```js
numeros.push(40);   // final
numeros.unshift(5); // inicio
```

**Eliminar elementos**

```js
numeros.pop();   // último
numeros.shift(); // primero
```

## 9. Recorrer Arrays

```js
for (let i = 0; i < numeros.length; i++) console.log(numeros[i]);
let i = 0;
while (i < numeros.length) { console.log(numeros[i]); i++; }
for (let n of numeros) console.log(n);
```

## 10. Matrices (Arrays de Arrays)

```js
let sala = [
  ["A1","A2"], 
  ["B1","B2"]
];
console.log(sala[1][0]); // "B1"
sala[0][1] = "Reservado"; // modificar
```

**Recorrer matriz**

```js
for (let fila of sala) {
  for (let asiento of fila) console.log(asiento);
}
```


## 11. Funciones

### Declaración de función
```js
function saludar(nombre) {
  return `Hola, ${nombre}!`;
}
console.log(saludar("Ana")); // "Hola, Ana!"
```

### Generación de Números Aleatorios en JavaScript

| Propósito | Fórmula | Ejemplo |
|-----------|--------|--------|
| Número entre 0 y un valor máximo (max) | `Math.floor(Math.random() * (max + 1))` | `Math.floor(Math.random() * 11)` |
| Número entre 1 y un valor máximo (max) | `Math.floor(Math.random() * max) + 1` | `Math.floor(Math.random() * 10) + 1` |
| Número entre un mínimo (min) y un máximo (max) | `Math.floor(Math.random() * (max - min + 1)) + min` | `Math.floor(Math.random() * (15 - 5 + 1)) + 5` |
| Decimal entre 0 y 1 | `Math.random()` | `Math.random()` |
