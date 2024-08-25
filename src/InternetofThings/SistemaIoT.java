package InternetofThings;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

// Clase principal para probar el sistema
public class SistemaIoT {
    public static void main(String[] args) {
        // Crear dispositivos
        SensorDeTemperatura sensor = new SensorDeTemperatura();
        CamaraDeSeguridad camara = new CamaraDeSeguridad();
        AltavozInteligente altavoz = new AltavozInteligente();

        // Operar los dispositivos
        sensor.encender();
        sensor.realizarFuncionEspecifica();
        sensor.apagar();

        camara.encender();
        camara.realizarFuncionEspecifica();
        camara.apagar();

        altavoz.encender();
        altavoz.realizarFuncionEspecifica();
        altavoz.apagar();

        // Mostrar historial de estados de los dispositivos
        System.out.println("\nHistorial de Sensor de Temperatura:");
        sensor.getHistorialDeEstado().forEach(System.out::println);

        System.out.println("\nHistorial de Camara de Seguridad:");
        camara.getHistorialDeEstado().forEach(System.out::println);

        System.out.println("\nHistorial de Altavoz Inteligente:");
        altavoz.getHistorialDeEstado().forEach(System.out::println);
    }
}