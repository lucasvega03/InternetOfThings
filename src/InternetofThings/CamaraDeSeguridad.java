package InternetofThings;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

// Clase para representar una cámara de seguridad
class CamaraDeSeguridad extends Dispositivo {
    public CamaraDeSeguridad() {
        super();
    }

    public void capturarImagen() {
        // Simulando la captura de una imagen
        System.out.println("Imagen capturada por la camara de seguridad.");
    }

    @Override
    public void realizarFuncionEspecifica() {
        capturarImagen();
    }
}