package InternetofThings;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class SensorDeTemperatura extends Dispositivo {
    private double temperatura;

    public SensorDeTemperatura() {
        super();
        this.temperatura = 0.0;
    }

    public double leerTemperatura() {
        // Simulando la lectura de temperatura
        this.temperatura = Math.random() * 100;
        return temperatura;
    }

    @Override
    public void realizarFuncionEspecifica() {
        System.out.println("Temperatura actual: " + leerTemperatura() + " Grados Celcius");
    }
}