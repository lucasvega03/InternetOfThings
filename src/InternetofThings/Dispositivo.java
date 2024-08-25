package InternetofThings;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

// Clase abstracta para representar un dispositivo genérico
abstract class Dispositivo {
    private boolean encendido;
    private List<String> historialDeEstado;

    public Dispositivo() {
        this.encendido = false;
        this.historialDeEstado = new ArrayList<>();
        registrarHistorial();
    }

    public void encender() {
        encendido = true;
        registrarHistorial();
    }

    public void apagar() {
        encendido = false;
        registrarHistorial();
    }

    public boolean estaEncendido() {
        return encendido;
    }

    private void registrarHistorial() {
        String estado = (encendido ? "Encendido" : "Apagado") + " - " + new Date().toString();
        historialDeEstado.add(estado);
    }

    public List<String> getHistorialDeEstado() {
        return historialDeEstado;
    }

    public abstract void realizarFuncionEspecifica();
}