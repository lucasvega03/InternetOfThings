package InternetofThings;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

// Clase para representar un altavoz inteligente
class AltavozInteligente extends Dispositivo {
    public AltavozInteligente() {
        super();
    }

    public void reproducirMusica(String cancion) {
        // Simulando la reproducción de música
        System.out.println("Reproduciendo: " + cancion);
    }

    @Override
    public void realizarFuncionEspecifica() {
        reproducirMusica("Cancion de ejemplo");
    }
}