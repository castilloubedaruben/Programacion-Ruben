// Ejercicio 6: Clase Reloj
// Crea una clase Reloj con atributos hora, minuto y segundo. 
// Agrega un método toString() que devuelva la hora en formato hh:mm:ss.
// Agrega el método sumarMinutos(minutos) , restarMinutos(minutos) , sumarSegundos(segundos) y restarSegundos(segundos).

package und5.relacion1;

public class ej6 {
    
}

class Reloj {
    int hora;
    int minuto;
    int segundo;

    Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    void sumarMinutos(int minuto) {
        int añadirMinutos=0;
        int minutosSobrantes;
        int minutosActuales;
        if (minuto+añadirMinutos >= 60) {
            this.hora+=1;
            minutosActuales=60-minuto;
            minutosSobrantes=añadirMinutos-minutosActuales;
            this.minuto=minutosSobrantes;
        } 
    }

    void restarMinutos(int minutos) {
        int restarMinutos=0;
        int minutosSobrantes;
        int minutosActuales;
        if (minuto-restarMinutos<0) {
            this.hora-=1;
            minutosActuales=60-minuto;
            minutosSobrantes=restarMinutos-minutosActuales;
            this.minuto=minutosSobrantes;
        }
        this.minuto+=restarMinutos;
    }

    void sumarSegundos(int segundos) {
        int añadirSegundos=0;
        this.minuto+=añadirSegundos;
    }

    void restarSegundos(int segundos) {
        int restarMinutos=0;
        this.minuto+=restarMinutos;
    }

    @Override
    public String toString() {
        return "Hora actual: " +hora +":" +minuto+":"+segundo;
    }
}
