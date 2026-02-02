// Ejercicio 2: Clase CuentaBancaria
// Crea una clase CuentaBancaria con atributos titular y saldo. 
// Agrega métodos depositar(cantidad) y retirar(cantidad), asegurando que el saldo no sea negativo después de un retiro.

package und5.relacion1;

public class ej2 {
    public static void main(String[] args) {
        CuentaBancaria primerTitular =new CuentaBancaria("Ruben", 1500);
        CuentaBancaria segundoTitular =new CuentaBancaria("Reda", 500);
        System.out.println(primerTitular.retirarSaldo(1000));
        System.out.println(segundoTitular.retirarSaldo(300));
    }
}

class CuentaBancaria {
    String titular;
    int saldo;

    public CuentaBancaria(String nombre, int saldo) {
        this.titular=nombre;
        this.saldo=saldo;
    }

    public int depositarSaldo(int cantidad) {
        this.saldo+=cantidad;
        return this.saldo;
    }
    
    public int  retirarSaldo(int cantidad){
        int resultado=this.saldo-=cantidad;
        if (resultado <0) {
            System.out.println("Saldo negativo, no se puede sacar dinero");
            this.saldo+=cantidad;
        } 
        return saldo;
    }
}