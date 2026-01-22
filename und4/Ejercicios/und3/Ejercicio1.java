// 1. Imprimir un mensaje de saludo
// Crea una función llamada saludar que reciba un nombre como parámetro y devuelva un mensaje de saludo personalizado.

// function saludo(nombre) {
//     let mensaje="Hola " + nombre
//     return(mensaje)
// }
// let nombreUsuario=prompt("Como es tu nombre?")
// console.log(saludo(nombreUsuario));

package und4.ejercicios.und3;

public class Ejercicio1 {

    public static void saludo (nombreUsuario) {
        System.out.println("Buenas tardes " + nombreUsuario);
    }

    public static void main(String[] args) {
        String nombre = "Ruben";
        System.out.println(saludo(nombre));
    }
}

