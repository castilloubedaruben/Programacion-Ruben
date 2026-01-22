package und4.Ejercicios.und1.Relacion1;
// 9. Repartir caramelos entre niños
// Pide al usuario cuántos caramelos tiene y cuántos niños hay. Calcula cuántos caramelos recibe cada niño y cuántos sobran.

//     let caramelosTotales = Number(prompt("Indique el número de caramelos que tienes"))
//     let ninios = Number(prompt("Indique el número de niños que hay"))
//     let caramelosRepartir = parseInt(caramelosTotales / ninios)
//     let caramelosSobrantes = (caramelosTotales % ninios)

//     console.log("Cada niño toca a " + caramelosRepartir + " caramelos. Y sobran " + caramelosSobrantes + " caramelos.")

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int caramelosTotales = 0;
        int ninios = 0;
        int caramelosRepartir = 0;
        int caramelosSobrantes= 0;
    
        System.out.print("Cuantos caramelos hay en total?");
        caramelosTotales = scanner1.nextInt();
        System.out.print("Cuantos niños hay en total?");
        ninios = scanner1.nextInt();
        scanner1.close();
        
        caramelosRepartir = caramelosTotales / ninios;
        caramelosSobrantes= caramelosTotales%ninios;

        System.out.println("Hay un total de " + caramelosRepartir + " para cada niño y sobran " + caramelosSobrantes + " caramelos.");
    }
}
